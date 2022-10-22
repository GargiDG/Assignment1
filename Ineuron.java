package com.gargi;

public class Ineuron {

	public static void main(String[] args) {
		int n=11;
		
		for(int i=0; i<n; i++) {
			//For Printing I
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1 || j== (n-1)/2)	
				 {
				
				System.out.print("*");
				 }
	
	            else {
		        System.out.print(" ");
		         }
				}
			//For Printing N
			for(int j=0; j<n; j++) {
				if( j==0|| j==n-1 || i==j) {
					System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}					
				}
			//For Printing E	
			for(int j=0; j<n;j++) {
				if((i==0 && j<(n-1)) ||j==0 || (i==n-1 && j<(n-1)) || 
						(i==(n-1)/2 && j<=(n-1)/2)) {
					System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			
			//For Printing U
			for(int j=0; j<n; j++) {
				if((j==0 && i<(n-1))||(j==(n-1)&& i<(n-1)) ||
					(i==(n-1) && j>0 && j<(n-1))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}	
			
			//For Printing R
			for(int j=0;j<n; j++) {	
				if(j==0 || (i==0 && j<((3*n/4))) || (j==((3*n/4)) && i>0 && i< (n-1)/2) 
						|| (i==(n-1)/2 && j<3*n/4)
						|| (i==j) && i>(n-1)/2 && j>n/2) 									
					{
						System.out.print("*");
					}
				else {
					System.out.print(" ");
				}
			}
			
			//For Printing O
			for(int j=0; j<n; j++) {
				if((j==0 && i>0 && i<(n-1))||(i==0 && j>0 && j<(n-1))||(j==(n-1) && i>0 && i<(n-1))
					||(i==(n-1) && j>0 && j<n-1))			
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
			//For Printing N
			for(int j=0; j<n; j++) {
				if( j==0|| j==n-1 || i==j) {
					System.out.print("*");	
					}
				else {
					System.out.print(" ");
					}					
				}
			System.out.println();
			
		}	
		
	}

}
