package com.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = 4;
		 int i, j;
		 int k=2*n-2;
		
		// int num =1;
	     for(i=n; i>=1; i--)
	        {
	    	
	            for(j=k; j>=1; j--)
	            {
	                System.out.print(" ");
	            }
	            k = k + 1;
	            for(j=i; j>=1; j--)
	            {
	                System.out.print("* ");
	              //  num++;
	            }
	            System.out.println();
	        }
}}
