package com.capg.assignment2;

public class Stringbf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = new String[4];
		str[0] = "StringBuffer";
		str[1] = "is a peer class of String";
		str[2] = "that provides much of";
		str[3] = "the functionality of strings";
		
		StringBuffer sb = new StringBuffer();
		for(String s : str) {
			sb.append(s);
			sb.append(" ");
		}
		
		System.out.println("After appending in stringbuffer "+sb);
	}

}
