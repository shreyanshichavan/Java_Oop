// Aim:-PracticalNo3
//Author:-Shreyanshi chavan
//Rollno:-AD23D006
//Date:-13/2/2024 

import java.util.Scanner;

class PracticalNo3
{
	public static Scanner scanner = new Scanner(System.in);
	public double calculateVolume(Double sideLength)
{
	return Math.pow(sideLength,3);
	}	
	public double calculateVolume(Double radius,Double height)
{
	return Math.PI * Math.pow(radius,2) * height;
	}
	public double calculateVolume(Double length,Double width,Double height)
{
		return length * width * height;
	}

	public static void main(String[]args)
{
	PracticalNo3 calculator = new PracticalNo3();

	System.out.print("Enter side length of cube:");
	Double cubeSideLength = scanner.nextDouble();

	System.out.print("Enter Radius of Cylinder:");
	Double cylinderRadius = scanner.nextDouble();
	System.out.print("Enter height of Cylinder:");
	Double cylinderHeight = scanner.nextDouble();

	System.out.print("Enter length of box:");
	Double boxLength = scanner.nextDouble();
	System.out.print("Enter width of Box");
	Double boxWidth = scanner.nextDouble();
	System.out.print("Enter height of box:");
	Double boxHeight = scanner.nextDouble();

	double cubeVolume = calculator.calculateVolume(cubeSideLength);
	System.out.println("Volume of cube:"+cubeVolume);
	double cylinderVolume = calculator.calculateVolume(cylinderRadius,cylinderHeight);
	System.out.println("Volume of Cylinder:"+cylinderVolume);
	double boxVolume = calculator.calculateVolume(boxLength,boxWidth,boxHeight);
	System.out.println("Volume of Box:"+boxVolume);
	}
}