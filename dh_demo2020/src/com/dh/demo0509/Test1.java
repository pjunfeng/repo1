package com.dh.demo0509;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

/*
 * ����
 * �������֣���ˮ����FLowLayout
 *              JPanelĬ�ϲ���
 *          �߽粼��BorderLayout
 *              JFrameĬ�ϲ��֣����ֲ��ֽ���Ļ�ֳɶ��������� 5������
 *              �����������ʱ��Ĭ�Ϸ����м䣬��ʱ�����������û�������
 *              ������쵽���������� 
 *          ���񲼾�grideLayout
 */
public class Test1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(500, 10, 400, 400);
		jf.setDefaultCloseOperation(3);
		
		JButton jb1 = new JButton("���1");
		jf.add(jb1);
		
		JButton jb2 = new JButton("���2");
		jf.add(jb2,BorderLayout.EAST);
		
		JButton jb3 = new JButton("���3");
		jf.add(jb3,BorderLayout.WEST);
		
		JButton jb4 = new JButton("���4");
		jf.add(jb4,BorderLayout.NORTH);
		
		JButton jb5 = new JButton("���5");
		jf.add(jb5,BorderLayout.SOUTH);
		
		jf.setVisible(true);
	}
}
