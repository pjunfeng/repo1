package com.dh.demo0514_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test3 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(300, 100, 400, 400);
		jf.setDefaultCloseOperation(3);
		MyPanel3 mp = new MyPanel3();
		jf.add(mp);
		jf.setVisible(true);
	}
}
class MyPanel3 extends JPanel implements MouseListener,Runnable{
	public MyPanel3() {
		this.setBackground(Color.black);
		this.addMouseListener(this);
	}		

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int c_x = x;
		int c_y = y;
		Graphics g = this.getGraphics();
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		int z_x = 0;
		int z_y = c_y;
		while(z_x<=c_x) {
			g.drawLine(0, z_y, z_x, z_y);
			z_x++;
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	int x;
	int y;
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
	
}
