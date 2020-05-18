package com.dh.demo0507;

import java.io.FileReader;
import java.io.IOException;

public class Test3 {
	    public static void main(String[] args) throws IOException {
	        FileReader fr=new FileReader("D:/demo1_Test3.txt");
	        for (int i=0;i<4;i++){
	            System.out.println((char)fr.read());
	        }//¾­µäÂÒÂëÎÊÌâ
	        fr.close();
	}
}
