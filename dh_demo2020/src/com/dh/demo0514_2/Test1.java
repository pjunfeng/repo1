package com.dh.demo0514_2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * �¼� ����ʲô���飬����¼��������ק�¼��������¼�����
 * ���� ĳ������ȥ�����¼��Ƿ���������aȥ����b�����b������ĳЩ�¼�����a��ִ����Ԥ���Ĵ���
 *     a�Ǽ����ߣ�b�Ǳ������ߡ�
 *     a����b,a��b���Ƕ������a����b����b.add***Listener(a);(***������ꡢ���̵�)
 *     a����ܼ���b����aһ��Ҫ��һ����������ݡ�
 *     java�����Ҫ����ݣ�����ʹ�ü̳С�������ʹ�ýӿڡ�
 */
public class Test1 {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setBounds(200, 100, 400, 400);
		jf.setDefaultCloseOperation(3);
		JPanel jp = new JPanel();
		JButton jb = new JButton("���");
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
		System.out.println("����˰�ť");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
