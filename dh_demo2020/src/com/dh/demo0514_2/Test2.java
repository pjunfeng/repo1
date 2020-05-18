package com.dh.demo0514_2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(200, 100, 400, 400);
		jf.setDefaultCloseOperation(3);
		
		MyPanel1 mp = new MyPanel1();
		jf.add(mp);
		
		jf.setVisible(true);
	}
}
class MyPanel1 extends JPanel implements MouseListener{
	public MyPanel1() {
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
		this.setBackground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}	
}