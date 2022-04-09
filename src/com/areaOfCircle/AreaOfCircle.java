package com.areaOfCircle;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Redius:- ");
		int r = sc.nextInt();
		double py = 3.14;
		double area = py*r*r;
		System.out.println("Area of Circle:-"+area);
        sc.close();


	}

}
