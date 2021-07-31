package com.day5.leapyear;

import java.util.Scanner;

public class LeapYear {
	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		    System.out.println("Enter year :");
          int year = sc.nextInt();
          boolean leap = false;
          
		    if (year % 400 == 0)
		    {
                leap = true;
		    }     
		    else if (year % 100 == 0)
		      {
                leap = false;
		      }
		    else if (year % 4 == 0)
		    { 	
		          leap = true;
		    }
		    else
		    { 	
		          leap = false;
		    }
		      
		   if (leap)
		   {
			   System.out.println(year + " is a leap year.");
		   }
		   else
	        {
		      System.out.println(year + " is not a leap year.");
	        }
		   sc.close();
	 }
}
