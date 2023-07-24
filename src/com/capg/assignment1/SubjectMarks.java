package com.capg.assignment1;

import java.util.Scanner;

public class SubjectMarks{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int sub1=sc.nextInt();
       int sub2=sc.nextInt();
       int sub3=sc.nextInt();
       if(sub1>60 && sub2>60 && sub3>60) {
    	   System.out.println("Passed");
       }else if(sub1>60 && sub2>60 || sub2>60 && sub3>60 || sub3>60 && sub1>60){
    	   System.out.println("Passed");
       }else {
    	   System.out.println("Failed");
       }
       sc.close();
	}

}
