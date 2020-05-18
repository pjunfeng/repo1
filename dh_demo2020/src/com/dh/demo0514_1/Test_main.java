package com.dh.demo0514_1;

import javax.swing.JFrame;

public class Test_main {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(500, 300, 800, 520);
		
		jf.setDefaultCloseOperation(3);
		
		MainPanel mp = new MainPanel();
		
		jf.add(mp);
		
		jf.setVisible(true);
		
		mp.go();
	}
}
