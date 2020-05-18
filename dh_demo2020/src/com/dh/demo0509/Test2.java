package com.dh.demo0509;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(500, 10, 400, 400);
		jf.setDefaultCloseOperation(3);
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(4,4));
		jf.add(jp);
		
		for(int i = 0;i<16;i++) {
		JButton jb1 = new JButton("µã»÷");
		jp.add(jb1);
		}
		
		jf.setVisible(true);
	}
}
