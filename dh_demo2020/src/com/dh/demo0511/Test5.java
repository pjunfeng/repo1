package com.dh.demo0511;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test5 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(200,10,1000,500);
        jf.setDefaultCloseOperation(3);
        MyPanel5 mp=new MyPanel5();
        jf.add(mp);
        jf.setVisible(true);
        mp.go();
    }
}
class MyPanel5 extends JPanel{
    final int N=20;
    private int[] yy=new int[20];//����N�����y��
    private Color[] cc=new Color[N];//����N�������ɫ
    private int[] s=new int[N];//����N������ٶ�
    private boolean[] flag=new boolean[N];//����N�����״̬��true����������false��������
    public MyPanel5(){
        this.setBackground(Color.black);
        for (int i = 0; i < N; i++) {
            cc[i]=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
            s[i]=i+1;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < N; i++) {
            g.setColor(cc[i]);
            g.fillOval(50*i,yy[i],40,40);
        }

    }
    public void go(){
        while(true){
            for (int i = 0; i < N; i++) {
                if(flag[i]){
                    yy[i]=yy[i]-s[i];
                    if(yy[i]<=0){
                        flag[i]=false;
                    }
                }else{
                    yy[i]=yy[i]+s[i];
                    if(yy[i]>=410){
                        flag[i]=true;
                    }
                }
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }
}
