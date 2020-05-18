package com.dh.demo0514_1;

import java.awt.Graphics;

import javax.swing.JPanel;

public class MainPanel extends JPanel{
	private MainBackground bg;
	private MyFish[] mfs;
	public MainPanel() {
		bg = new MainBackground();
		mfs = new MyFish[10];
		for(int i = 0; i < mfs.length; i++){
			mfs[i] = new MyFish((int)(Math.random()*11)+1);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		bg.paintBackground(g);
		for(int i = 0; i < mfs.length; i++){
			mfs[i].paintFish(g);
		}
	}
	public void go() {
		while(true) {
			for(int i = 0; i < mfs.length; i++) {
				mfs[i].move();
			}
			try {
				Thread.sleep(52);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}	
}
