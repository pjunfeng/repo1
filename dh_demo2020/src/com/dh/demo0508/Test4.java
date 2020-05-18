package com.dh.demo0508;

import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test4 {
	public static void main(String[] args) {
        Random r=new Random();
        for(int i=0;i<1000;i++){
            JFrame jf=new JFrame();
            jf.setBounds(r.nextInt(1920),r.nextInt(1080),r.nextInt(300),r.nextInt(300));
            jf.setDefaultCloseOperation(3);
            JPanel jp=new JPanel();
            jp.setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
            jf.add(jp);
            jf.setVisible(true);
        }
	}
}
