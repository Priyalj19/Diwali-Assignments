package com.demo;

import java.util.Scanner;

public class Que3 {

	static int findFactorial(int n){
		 int fac=1;
		 for(int i=1;i<=n;i++) {
			 fac=fac*i;
		 }
		 return fac;
		}

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num=sc.nextInt();
	    System.out.println("factorial of a " +num+ " is " +findFactorial(num));
	    
	   
	}

	}

