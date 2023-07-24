package com.capg.assignment1;

import java.util.Scanner;

import javax.annotation.processing.SupportedSourceVersion;

public final class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int Asub1=sc.nextInt();
       int Asub2=sc.nextInt();
       int Asub3=sc.nextInt();
       
       int Bsub1=sc.nextInt();
       int Bsub2=sc.nextInt();
       int Bsub3=sc.nextInt();
       
       int Csub1=sc.nextInt();
       int Csub2=sc.nextInt();
       int Csub3=sc.nextInt();
       
       int Asum=Asub1+Asub2+Asub3;
       int Bsum=Bsub1+Bsub2+Bsub3;
       int Csum=Csub1+Csub2+Csub3;
       
       int Aaverage=Asum/3;
       int Baverage=Bsum/3;
       int Caverage=Csum/3;
       
       System.out.println("Total marks of Student1 "+Asum);
       System.out.println("Total marks of Student2 "+Bsum);
       System.out.println("Total marks of Student3 "+Csum);
       
       System.out.println("Average marks of Student1 "+Aaverage);
       System.out.println("Average marks of Student2 "+Baverage);
       System.out.println("Average marks of Student3 "+Caverage);
       
       int sub1Total= Asub1+Bsub1+Csub1;
       int sub2Total= Asub2+Bsub2+Csub2;
       int sub3Total= Asub3+Bsub3+Csub3;
       
       int sub1Avg=sub1Total/3;
       int sub2Avg=sub2Total/3;
       int sub3Avg=sub3Total/3;
       
       System.out.println("Total marks of A "+sub1Total);
       System.out.println("Total marks of B "+sub2Total);
       System.out.println("Total marks of C "+sub3Total);
       
       System.out.println("Average marks of A "+Aaverage);
       System.out.println("Average marks of B "+Baverage);
       System.out.println("Average marks of C "+Caverage);
	}

}
