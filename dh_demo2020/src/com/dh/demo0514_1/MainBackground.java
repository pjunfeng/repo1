package com.dh.demo0514_1;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MainBackground {
	private Image img;
	private int x;
	private int y;
	public MainBackground() {
		try {
			img = ImageIO.read(new File("images/bg.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		x = 0;
		y = 0;
	}
	public void paintBackground(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
}
