package com.capg.assignment2;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="Java String pool refers to collection of Strings which are stored in heap memory";
       String str1="java string pool refers to collection of strings which are stored in heap memory";
       System.out.println(str.toLowerCase());
       System.out.println(str.toUpperCase());
       String str2=str.replace('a', '$');
       System.out.println(str2);
       System.out.println(str.contains("collection"));
       System.out.println(str.equals(str1));
       System.out.println(str.matches(str1));
	}
}
