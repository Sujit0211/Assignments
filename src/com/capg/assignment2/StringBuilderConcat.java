package com.capg.assignment2;

public class StringBuilderConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("It is used to _ at the specified index position");
		StringBuilder addStr = new StringBuilder("insert text");
		
		int indexOfUnderscore = sb.indexOf("_");
		
		if(indexOfUnderscore!=1) {
			sb.replace(indexOfUnderscore, indexOfUnderscore+1, addStr.toString());
		}
		
		System.out.println("Modified String is: "+sb);
	}

}
