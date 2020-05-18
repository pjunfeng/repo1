package com.dh.demo0512;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(300,10,800,520);
        MyPanel2 myPanel2=new MyPanel2();
        jf.add(myPanel2);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
        myPanel2.go();
    }
}
class MyPanel2 extends JPanel{
    private Image bg;
    private Image fish;//当前被画出来的图片，这个图片是从数组中取出来的
    private Image[] fishes;//一条鱼的所有图片
    private int index=0;
    private int x=500;
    public MyPanel2(){
        try {
            fishes=new Image[10];
            for (int i = 0; i <fishes.length ; i++) {
                fishes[i]=ImageIO.read(new File("images/fish8_"+(i+1)+".png"));
            }

            bg= ImageIO.read(new File("images/bg.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(bg,0,0,null);
        g.drawImage(fish,x,300,null);
    }
    public void go(){
        while(true){
            x=x-4;
            index++;
            if(index>=fishes.length){
                index=0;
            }
            fish=fishes[index];
            try {
                Thread.sleep(77);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }
    }
}
