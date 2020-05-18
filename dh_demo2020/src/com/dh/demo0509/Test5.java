package com.dh.demo0509;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test5 {
	public static void main(String[] args) {
		char [] Array = {'1','2','3','+','4','5','6','-','7','8','9','*','/','0','.','='};
		JFrame jf = new JFrame();
		jf.setBounds(400, 10, 300, 450);
		jf.setDefaultCloseOperation(3);
		
		JTextField jtf = new JTextField("0.0");
		jtf.setFont(new Font("ºÚÌå", 0, 35));
		jtf.setHorizontalAlignment(JTextField.RIGHT);
		
		jf.add(jtf, BorderLayout.NORTH);
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.white);
		jp.setLayout(new GridLayout(4,4));
		jf.add(jp);
		
		for (int i = 0; i < Array.length; i++) {
			JButton jb = new JButton(""+Array[i]);
			jb.setLayout(new GridLayout(4, 4, 1, 1));
			jp.setBackground(Color.black);
			jp.add(jb);
		}
		jf.setVisible(true);
	}
}
