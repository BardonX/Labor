package com.labor.test;

import javax.print.DocFlavor.STRING;

public class MethodTest {

	public static void main(String[] args) {
		String s1="030102教四108";
		String s2="03010203教四108";
		System.out.println(s2.charAt(6));
		StringBuilder stringBuilder=new StringBuilder();
		/*if(Character.isDigit(s2.charAt(6))){
			//三节课
			System.out.println("s2 是三节课");
			String time=s2.substring(0,8);
			String addr=s2.substring(8);
			String name="数据结构";
			stringBuilder.append(name);
			stringBuilder.append("@");
			stringBuilder.append(addr);
			String result=stringBuilder.toString();
			
			System.out.println(time);
			
			System.out.println(addr);
			System.out.println(result);
		}else {
			System.out.println("不是");
		}*/
		System.out.println(s1.substring(0,2));
		System.out.println(s1.substring(2,4));
	}
}
