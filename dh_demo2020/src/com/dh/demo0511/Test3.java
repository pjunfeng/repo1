package com.dh.demo0511;

import javax.swing.*;
import java.awt.*;

public class Test3 {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(400,10,418,255);
        jf.setDefaultCloseOperation(3);
        MyPanel3 mp=new MyPanel3();
     jf.add(mp);
     jf.setVisible(true);
    }
}
class MyPanel3 extends JPanel{
    private ImageIcon ii;
    public MyPanel3(){
        this.setBackground(Color.black);
        ii=new ImageIcon("1.gif");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(ii.getImage(),0,0,this);
    }
}