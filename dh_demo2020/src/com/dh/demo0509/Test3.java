package com.dh.demo0509;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
        jf.setBounds(500,10,400,400);
        jf.setDefaultCloseOperation(3);
        jf.setLayout(null);//ȥ��FrameĬ�ϵı߽粼�� ��ʱ��û���κβ���
        
        JButton jb=new JButton("���");
        jb.setBounds(100,10,100,100);
        jf.add(jb);
        
        jf.setVisible(true);
	}
}
