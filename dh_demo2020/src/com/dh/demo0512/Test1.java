package com.dh.demo0512;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(400,10,800,520);
        jf.setDefaultCloseOperation(3);
        MyPanel1 mp=new MyPanel1();
        jf.add(mp);
        jf.setVisible(true);
    }
}
class MyPanel1 extends JPanel{
    private Image img;
    public MyPanel1(){
        this.setBackground(Color.black);
        try {
            img= ImageIO.read(new File("1.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(img,0,0,null);
    }
}
