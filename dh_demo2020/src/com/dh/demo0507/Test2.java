package com.dh.demo0507;

import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
        //打印字符串
        String name="陈老师";
        System.out.println(name);
        //打印控制台输入字符串
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s);
        //打印时间
        Date d=new Date();
        String str=d.toLocaleString();
        System.out.println(s);
	}

}
