package com.demo;

import java.util.Scanner;

public class Que5 {
	static boolean isCheck(int n){
		   if(n%2==0) {
			   return true;
		   }
		   return false;
		}

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num=sc.nextInt();
	    boolean ans=isCheck(num);
	    if(ans){
	        System.out.println("Number is Even");
	    }
	    else{
	    	 System.out.println("Number is Odd");
	    }
	   
	}

	}
