package com.areaOfTriangle;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Height of Triangle");
		double height = sc.nextDouble();
		System.out.println("Height of Triangle :- "+height);
		System.out.println("Enter the Base of Triangle");
		double base = sc.nextDouble();
		System.out.println("Base of Triangle :- "+base);
		double area = height * base / 2;
		System.out.println("Area of Triangle :- "+area);
		sc.close();

	}

}
