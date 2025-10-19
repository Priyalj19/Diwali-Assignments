package com.demo;

import java.util.Scanner;

public class Que1 {
	
	static boolean isPrime(int n){
		 if(n<=1){
		        return false;
		    }
		    for(int i=2;i<n;i++){
		        if(n%i==0){
		          return false;
		        }
		    }
		    return true;
		}

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number");
	    int num=sc.nextInt();
	    boolean ans=isPrime(num);
	    if(ans){
	        System.out.println("Given number is prime");
	    }
	    else{
	    	 System.out.println("Not a prime");
	    }
	   
	}

	}






    