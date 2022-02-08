package ink.hkc.Work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Painting extends JPanel {
    //蛇的名字
    private String name;
    //食物名字
    private String food;
    //蛇的方向
    private char direction;
    //游戏状态
    private boolean isStart = false;
    //是否失败
    private boolean isFail = false;
    //定时器
    private Timer timer = new Timer(50, new PaintingListener());
    //随机数
    private Random random;
    //记录蛇长和蛇身体的坐标
    private int headLength;
    private int length;
    private int[] snakeX = new int[500];
    private int[] snakeY = new int[500];
    //食物
    private int foodX;
    private int foodY;

    public Painting() {
        //设置蛇的名字
        this.name = "玩家";
        //设置食物名字
        this.food = "猪";
        //初始化
        this.init();
        //获得焦点和监听键盘
        this.setFocusable(true);
        this.addKeyListener(new PaintingListener());
    }

    public Painting(String name, String food) {
        //设置蛇的名字
        this.name = name;
        //设置食物名字
        this.food = food;
        //初始化
        this.init();
        //获得焦点和监听键盘
        this.setFocusable(true);
        this.addKeyListener(new PaintingListener());
    }

    //初始化
    public void init() {
        //设置蛇的初始方向
        this.direction = 'R';
        //设置蛇长度及其蛇头初始坐标
        this.headLength = this.name.length();
        this.length = this.name.length();
        for ( int i=0; i<this.length; i++) {
            this.snakeX[i] = (this.length-i-1)*20;this.snakeY[i] = 20;
        }
        //创建随机数
        this.random = new Random();
        //初始化食物
        this.foodX = random.nextInt(1910);
        this.foodY = random.nextInt(1040)+30;

        this.timer.start();
    }

    @Override
    public void paint(Graphics g) {
        //初始化背景和画笔
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        g.drawString("当前长度："+(length-2), 1700, 20);
        //绘制食物
        g.drawString(this.food, this.foodX, this.foodY);
        //绘制小蛇
        for (int i=0; i<this.headLength; i++) {
            g.drawString(String.valueOf(this.name.charAt(i)), this.snakeX[i], this.snakeY[i]);
        }
        for (int i=this.headLength; i<this.length; i++) {
            g.drawString(this.food, this.snakeX[i], this.snakeY[i]);
        }
        //暂停
        if (!this.isStart) {
            g.setFont(new Font("微软雅黑", Font.PLAIN, 40));
            g.drawString("游戏说明：上下左右方向键控制方向，吃到食物身体会变长，吃到自己游戏结束", 200, 500);
            g.drawString("按下空格键开始", 800, 600);
        }
        //失败
        if (this.isFail) {
            g.setFont(new Font("微软雅黑", Font.PLAIN, 40));
            g.drawString("注意：别咬到自己", 800, 400);
            g.drawString("你已失败，按下空格键开始", 700, 500);
        }
    }

    private class PaintingListener extends KeyAdapter implements ActionListener {
        @Override
        public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            if (keyCode==KeyEvent.VK_SPACE) {
                if (isFail) {
                    isFail = false;
                } else {
                    isStart = !isStart;
                }

                repaint();
            }
            switch (keyCode) {
                case KeyEvent.VK_UP:
                    direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                    direction = 'D';
                    break;
                case KeyEvent.VK_RIGHT:
                    direction = 'R';
                    break;
                case KeyEvent.VK_LEFT:
                    direction = 'L';
                    break;
                default:
                    break;
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isStart && !isFail) {

                for (int i=length-1; i>0; i--) {
                    snakeX[i] = snakeX[i - 1];
                    snakeY[i] = snakeY[i - 1];
                }

                switch (direction) {
                    case 'U':
                        //上
                        snakeY[0] -= 20;
                        if (snakeY[0]<10)
                            snakeY[0] = 1070;
                        break;
                    case 'D':
                        //下
                        snakeY[0] += 20;
                        if (snakeY[0]>1070)
                            snakeY[0] = 10;
                        break;
                    case 'L':
                        //左
                        snakeX[0] -= 20;
                        if (snakeX[0] < 10)
                            snakeX[0] = 1910;
                        break;
                    case 'R':
                        //右
                        snakeX[0] += 20;
                        if (snakeX[0] > 1910)
                            snakeX[0] = 10;
                        break;
                    default:
                        break;
                }
                //判定吃到食物
                if (snakeX[0]-foodX<20&&snakeX[0]-foodX>-20 &&snakeY[0]-foodY<20&&snakeY[0]-foodY>-20) {
                    length += 1;
                    snakeX[length-1] = snakeX[length-2];
                    snakeY[length-1] = snakeY[length-2];

                    foodX = random.nextInt(1910);
                    foodY = random.nextInt(1040)+30;
                }
                //判定失败
                for (int i=1; i<length; i++) {
                    if (snakeX[0]-snakeX[i]<20&&snakeX[0]-snakeX[i]>-20&&snakeY[0]-snakeY[i]<20&&snakeY[0]-snakeY[i]>-20) {
                        isFail = true;
                        init();
                    }
                }
                repaint();
            }
            timer.start();
        }
    }
}
