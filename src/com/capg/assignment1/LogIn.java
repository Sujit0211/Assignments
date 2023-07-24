package com.capg.assignment1;

import java.util.Scanner;

public class LogIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String Userid=sc.next();
        String Password=sc.next();
        int count=0;
        for(int i=1;i<=3;i++) {
           System.out.println("Enter you userId and password");
           String user=sc.next();
           String password=sc.next();
           if(user.equals(Userid) && Password.equals(password)) {
        	   System.out.println("Welcome "+user);
        	   break;
           }
           count++;
        }
        if(count>3) {
        	System.out.println("Contact Admin");
        }
        sc.close();
	}

}
