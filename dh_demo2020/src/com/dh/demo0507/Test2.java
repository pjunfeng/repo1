package com.dh.demo0507;

import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
        //��ӡ�ַ���
        String name="����ʦ";
        System.out.println(name);
        //��ӡ����̨�����ַ���
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);
        //��ӡʱ��
        Date d=new Date();
        String str=d.toLocaleString();
        System.out.println(s);
	}

}
