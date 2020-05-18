package com.dh.demo0508;
/*
 *作者：裴峻锋
 *时间：2020年5月8日
 *功能：在屏幕随机位置生成随机尺寸、随机颜色的窗口
 *内容：swing gui窗体
 *JFrame窗体，JPanel面板
 *随机数生成方法
 *方法一：(int)(Math.random()*90+1)
 *表示：随机生成1~90范围内的int(整)型随机数。
 *方法二:
 *Random r = new Random;
 *int x = r.setInt(400+1);表示：随机生成1~400范围内的int(整)型随机数。
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
