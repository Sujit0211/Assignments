package com.capg.assignment1;

import java.util.Scanner;

public class CompundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();

	

		double SI = (principle * rate * time / 100);
		System.out.println(SI);

		double CI = principle * (Math.pow((1 + rate / 100), time)) -principle;
		System.out.println(CI);
		sc.close();
	}
}
