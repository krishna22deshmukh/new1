package com.areaOfTrapezoid;
import java.util.Scanner;
public class AreaOfTrapezoid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Height for Area:-");
		double height = sc.nextDouble();
		System.out.println("Height for Area:-"+height);
		System.out.println("Enter Base1 for Area:- ");
		double base1 = sc.nextDouble();
		System.out.println("Base1 for Area:- "+base1);
		System.out.println("Enter Base2 for Area:- ");
		double base2 = sc.nextDouble();
		System.out.println("Base2 for Area:- "+base2);
		double area = height * ( base1 + base2 ) / 2 ;
		System.out.println("Area of Trapezoid :- "+area);
		sc.close();

	}

}
