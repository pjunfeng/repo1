package com.dh.demo0508;
/*
 *���ߣ������
 *ʱ�䣺2020��5��8��
 *���ܣ�����Ļ���λ����������ߴ硢�����ɫ�Ĵ���
 *���ݣ�swing gui����
 *JFrame���壬JPanel���
 *��������ɷ���
 *����һ��(int)(Math.random()*90+1)
 *��ʾ���������1~90��Χ�ڵ�int(��)���������
 *������:
 *Random r = new Random;
 *int x = r.setInt(400+1);��ʾ���������1~400��Χ�ڵ�int(��)���������
 */
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i<=50;i++) {
		int x = (int)(Math.random()*1920);
		int y = (int)(Math.random()*1080);
		int w = (int)(Math.random()*500);
		int h = (int)(Math.random()*500);
		
		int r = (int)(Math.random()*255);
		int g = (int)(Math.random()*255);
		int b = (int)(Math.random()*255);
		
		JFrame jf = new JFrame();
		jf.setBounds(x, y, w, h);
		jf.setDefaultCloseOperation(3);
		
		JPanel jp = new JPanel();
		jp.setBackground(new Color(r,g,b));
		jf.add(jp);
		
		jf.setVisible(true);
		}
	}
}
