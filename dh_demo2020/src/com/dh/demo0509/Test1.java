package com.dh.demo0509;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

/*
 * 布局
 * 常见布局：流水布局FLowLayout
 *              JPanel默认布局
 *          边界布局BorderLayout
 *              JFrame默认布局，这种布局将屏幕分成东南西北中 5个部分
 *              当放入组件的时候，默认放在中间，这时如果东南西北没有组件，
 *              则会拉伸到整个容器。 
 *          网格布局grideLayout
 */
public class Test1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(500, 10, 400, 400);
		jf.setDefaultCloseOperation(3);
		
		JButton jb1 = new JButton("点击1");
		jf.add(jb1);
		
		JButton jb2 = new JButton("点击2");
		jf.add(jb2,BorderLayout.EAST);
		
		JButton jb3 = new JButton("点击3");
		jf.add(jb3,BorderLayout.WEST);
		
		JButton jb4 = new JButton("点击4");
		jf.add(jb4,BorderLayout.NORTH);
		
		JButton jb5 = new JButton("点击5");
		jf.add(jb5,BorderLayout.SOUTH);
		
		jf.setVisible(true);
	}
}
