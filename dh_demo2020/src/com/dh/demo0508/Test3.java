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
        //Color�Ĺ��췽����Ҫ3��������3�������ֱ����RGB �����Ǵ�0��255
        jp.setBackground(new Color(255,255,0));
        jf.add(jp);
        jf.setVisible(true);//���ô��ڿɼ�
	}

}
