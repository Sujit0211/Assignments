package com.capg.assignment;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the taxable amout :");
		double num = sc.nextInt();
		
		if(0<=num && num<=180000) {
			System.out.println("No tax for you");
		}
		else if(181000 <= num && num <=300000) {
			System.out.println("Tax for you "+ num/10 );
		} 
		else if(300001 <= num && num <=500000) {
			System.out.println("Tax for you "+ num/5 );
		}
		else if(500001 <= num && num <=1000000) {
			System.out.println("Tax for you "+ num*3/10 );
		}else {
			System.out.println("Out of range");
		}
		sc.close();
	}

}
