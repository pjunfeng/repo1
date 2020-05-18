package com.dh.demo0509;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test6 {
	public static void main(String[] args) {
		Random r = new Random();
		
		JFrame jf = new JFrame();
		jf.setBounds(400, 100, 400, 400);
		jf.setDefaultCloseOperation(3);
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.white);
		jf.add(jp);
		jp.setLayout(new GridLayout(20,20,1,1));
		
		for(int i = 0;i < 300;i++) {
			JPanel xjp = new JPanel();
			xjp.setBackground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			jp.add(xjp);
		}
		jf.setVisible(true);
	}
}
