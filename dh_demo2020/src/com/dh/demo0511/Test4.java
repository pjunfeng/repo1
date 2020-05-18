package com.dh.demo0511;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test4 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(200,10,500,500);
        jf.setDefaultCloseOperation(3);
        MyPanel4 mp=new MyPanel4();
        jf.add(mp);
        jf.setVisible(true);
        mp.go();
    }
}
class MyPanel4 extends JPanel{
    private int y=0;
    public MyPanel4(){
        this.setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(0,y,50,50);
    }
    public void go(){
        while(true){
            y++;
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }
}
