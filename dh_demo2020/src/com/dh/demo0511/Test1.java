package com.dh.demo0511;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
    /*JFrame  JPanel  都是jdk提供的
     * JPanel是一个面板，可以用来画图，Jpanel自带一个画笔，只要能拿到
     * 这个画笔就可以在panel上面画图。
     * 如果需要画图就需要panel中重写paint方法。只要有重写一定就有继承
     * 即需要定义一个类继承Jpanel，然后重写paint方法，在paint中画图
     * paint方法有一个形参Graphics g，这个g就是画笔.g可以画椭圆、矩形、直线、字符串。。。
     * g默认与背景颜色一样，所以使用之前先改一下g的颜色，g.setColor
     * 重写的paint方法，不需要手动调用，对象在被实例化的时候会自动调用这个方法
     * Jpanel中有一个repaint方法，手动调用这个方法后 paint方法就会执行一下
     *
     */
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setBounds(400, 10, 400, 400);
        jf.setDefaultCloseOperation(3);
        MyPanel1 mp =new MyPanel1();
        jf.add(mp);
        jf.setVisible(true);
    }
}
class MyPanel1 extends JPanel{
    public MyPanel1(){
        this.setBackground(Color.black);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.drawLine(0, 0, 200, 200);
        g.setColor(Color.yellow);
        g.drawString("hello", 10, 20);

        g.setColor(Color.green);
        g.fillOval(100, 100, 100, 200);

        g.setColor(Color.blue);
        g.fillRect(300, 100, 50, 50);
    }
}

