package com.dh.demo0511;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
    /*JFrame  JPanel  ����jdk�ṩ��
     * JPanel��һ����壬����������ͼ��Jpanel�Դ�һ�����ʣ�ֻҪ���õ�
     * ������ʾͿ�����panel���滭ͼ��
     * �����Ҫ��ͼ����Ҫpanel����дpaint������ֻҪ����дһ�����м̳�
     * ����Ҫ����һ����̳�Jpanel��Ȼ����дpaint��������paint�л�ͼ
     * paint������һ���β�Graphics g�����g���ǻ���.g���Ի���Բ�����Ρ�ֱ�ߡ��ַ���������
     * gĬ���뱳����ɫһ��������ʹ��֮ǰ�ȸ�һ��g����ɫ��g.setColor
     * ��д��paint����������Ҫ�ֶ����ã������ڱ�ʵ������ʱ����Զ������������
     * Jpanel����һ��repaint�������ֶ�������������� paint�����ͻ�ִ��һ��
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

