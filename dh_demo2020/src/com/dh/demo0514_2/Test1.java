package com.dh.demo0514_2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * 事件 发生什么事情，鼠标事件，鼠标拖拽事件，键盘事件……
 * 监听 某个对象去监听事件是否发生，比如a去监听b，如果b发生了某些事件，则a就执行它预定的代码
 *     a是监听者，b是被监听者。
 *     a监听b,a和b都是对象。如果a监听b，则：b.add***Listener(a);(***代表鼠标、键盘等)
 *     a如果能监听b，则a一定要有一个监听的身份。
 *     java中如果要给身份，可以使用继承、还可以使用接口。
 */
public class Test1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(200, 100, 400, 400);
		jf.setDefaultCloseOperation(3);
		JPanel jp = new JPanel();
		JButton jb = new JButton("点击");
		jf.add(jp);
		jp.add(jb);
		jf.setVisible(true);
		People p = new People();
		jb.addMouseListener(p);
	}
}
class People implements MouseListener{
	
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
		System.out.println("点击了按钮");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
