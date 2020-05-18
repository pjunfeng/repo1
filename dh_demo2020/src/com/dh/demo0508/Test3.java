package com.dh.demo0508;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test3 {

	public static void main(String[] args) {
        JFrame jf=new JFrame();
        jf.setBounds(500,50,400,400);
        jf.setDefaultCloseOperation(3);
        
        JPanel jp=new JPanel();
        //Color的构造方法需要3个整数，3个整数分别代表RGB 整数是从0到255
        jp.setBackground(new Color(255,255,0));
        jf.add(jp);
        jf.setVisible(true);//设置窗口可见
	}

}
