package com.dh.demo0509;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test4 {
	public static void main(String[] args) {
        JFrame jf= new JFrame();
        jf.setBounds(500,10,500,500);
        
        jf.setDefaultCloseOperation(3);
        
        JPanel jp=new JPanel();
        jf.add(jp);
        for (int i = 1; i <= 16; i++) {
            JButton jb=new JButton("µã»÷"+i);
            jp.add(jb);
        }
        
        jf.setVisible(true);
    
	}
}
