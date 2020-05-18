package com.dh.demo0514_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Desc:
 * @describe 鼠标点击，从四个方向向鼠标点击位置画直线
 * @author pjunfeng 
 * @date 2020年5月15日
 * @version 2.0
 * @param (参数)
 * @return 
 * @throws Exception
 */
public class Test5 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(200, 100, 500, 500);
		jf.setDefaultCloseOperation(3);

		MyPanel5 mp = new MyPanel5();

		jf.add(mp);

		jf.setVisible(true);
	}

}

class MyPanel5 extends JPanel implements MouseListener, Runnable {
	public MyPanel5() {
		this.setBackground(Color.black);
		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	int x;
	int y;

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX(); 
		y = e.getY(); 
		
		new Thread(this).start();		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	float leftX;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int clickX = x; 
		int clickY = y; 
		
		Graphics g = this.getGraphics(); 
		g.setColor(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
		
		leftX = 0;
		float upY = 0;
		float rightX = 400;
		float buttomY = 400;
		
		float time = 50;
		float speedL = clickX / time;
		float speedT = clickY / time;
		float speedR = (400 - clickX) / time;
		float speedB = (400 - clickY) / time;
		
		while(leftX <= clickX || upY <= clickY || rightX >= clickX || buttomY >= clickY) {
			g.drawLine(0, clickY, (int)leftX, clickY); 
			g.drawLine(clickX, 0, clickX, (int)upY); 			
			g.drawLine(400, clickY, (int)rightX, clickY); 			
			g.drawLine(clickX, 400, clickX, (int)buttomY); 
			
			leftX = leftX + speedL;
			upY = upY + speedT;
			rightX = rightX - speedR;
			buttomY = buttomY - speedB;
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
