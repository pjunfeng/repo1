package com.dh.demo0509;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
        jf.setBounds(500,10,400,400);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);//去掉Frame默认的边界布局 此时他没有任何布局
        
        JButton jb=new JButton("点击");
        jb.setBounds(100,10,100,100);
        jf.add(jb);
        
        jf.setVisible(true);
	}
}
