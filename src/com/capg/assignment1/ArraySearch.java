package com.capg.assignment1;

import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
      int [] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
      int n=sc.nextInt();
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]==n) {
    		  System.out.println(n+" is found in the index number "+i);
    	  }
      }
      sc.close();
	}

}
