package com.dh.demo0514_2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test4 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(400, 10, 400, 400);
		jf.setDefaultCloseOperation(3);
		
		MyPanel4 mp = new MyPanel4();
		jf.add(mp);
		
		jf.setVisible(true);
	}
}
class MyPanel4 extends JPanel implements MouseListener{
	public MyPanel4() {
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int o_x = e.getX();
		int o_y = e.getY();
		Graphics g = this.getGraphics();
		g.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
		g.fillOval(o_x, o_y, 5, 5);
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
}