package com.dh.demo0514_1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyFish {
	private Image[] imgs;
	private Image img;
	
	private int index;
	private int x;
	private int y;
	private int speed;
	
	public MyFish(int number) {
		imgs = new Image[10];
		for(int i = 0;i < imgs.length;i++) {
			try {
				imgs[i] = ImageIO.read(new File("images/fish"+number+"_"+(i+1)+".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		index = 0;
		img = imgs[index];
		x = (int)(Math.random()*600);
		x = (int)(Math.random()*400);
		speed = (int)(Math.random()*8+1);
	}
	public void paintFish(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	public void move() {
		x = x-speed;
		if(x < -img.getWidth(null)) {
			x = 800-16;
		}
		index++;
		if(index >= imgs.length) {
			index = 0;
		}
		img = imgs[index];
	}
}
