package com.areaOfRectangle;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length  :- ");
		int length = sc.nextInt();
		System.out.println("Enter the Breadth :- ");
		int breadth = sc.nextInt();
		int area = length * breadth;
		System.out.println("Area of Rectangle :- "+area);
		sc.close();
	}

}
