package com.day5.distance;

import java.util.Scanner;

public class Distance
{
public static void main(String arg[])
	
	{

	 int x,y;

Scanner sc=new Scanner(System.in);

System.out.println("enter x point");

    x=sc.nextInt();

    System.out.println("enter y point");

    y=sc.nextInt();

    double distance = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));

    System.out.println("Distance from (0, 0) to (" + x + ", " + y + ") is " + distance);

    sc.close(); 
}
}
