package com.dh.demo0511;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Desc:
 * @describe ��N�������˶���С�������߿����
 * @author pjunfeng 
 * @date 2020��5��15��
 * @version 2.0
 * @param (����)
 * @return 
 * @throws Exception
 */
public class Test6 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(200,10,1000,500);
        jf.setDefaultCloseOperation(3);
        MyPanel6 mp=new MyPanel6();
        jf.add(mp);
        jf.setVisible(true);
        mp.go();
    }
}
class MyPanel6 extends JPanel{
    final int N = 20;
    private int[] yy=new int[20];//����N�����y��
    private Color[] cc=new Color[N];//����N�������ɫ
    private int[] s=new int[N];//����N������ٶ�
    private boolean[] flag=new boolean[N];//����N�����״̬��true����������false��������
    public MyPanel6(){
        this.setBackground(Color.black);
        for (int i = 0; i < N; i++) {
            cc[i]=new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
            s[i]=i+1;
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.setColor(Color.black);
        g.fillRect(0, 435, 1000, 300);
        
        for (int i = 0; i < N; i++) {
            g.setColor(cc[i]);
                        
            int h = 45;
            if(yy[i] < 390 - s[i] / 2 && yy[i] >= 10) {
				g.fillOval(50 * i,yy[i], 50, 50);
			}else {
				h -= s[i] / 2;
				g.fillOval(50 * i, yy[i], 50, h);
			}            
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
                    if(yy[i]>=419){
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
