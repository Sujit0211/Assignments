package com.capg.assignment;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      int temp=n;
	      int sum=0;
	      while(temp>0) {
	    	  int b=temp%10;
	    	  sum=sum+b*b*b;
	    	  temp/=10;
	      }
	      if(sum==n) {
	    	  System.out.println(n+" is an armstrong number");
	      }else {
	    	  System.out.println(n+" is not an armstrong number");
	      }
	}

}
