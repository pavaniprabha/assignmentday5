package com.day5.evenodd;

import java.util.Scanner;

public class EvenOdd {
	 public static void main(String args[]) {
	        int num;
	   
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter an Integer:");
	        num = in.nextInt();
	 
	        if (num%2 == 0)
	            System.out.println(num + " is a EVEN Number");
	        else
	            System.out.println(num + " is ODD Number");
	         in.close();
 	    }
             
}

