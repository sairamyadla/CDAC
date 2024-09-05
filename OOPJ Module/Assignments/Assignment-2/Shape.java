package Assignment1;

import java.util.Scanner;

public class Shape {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter your choice:");
		int choice= sc.nextInt();
		switch(choice) {
		case 1: 
				System.out.println("Circle:");
			    System.out.print("Enter the radius of the circle: ");
				int radius = sc.nextInt();
				double circlearea = Math.PI * radius * radius;
	            System.out.println("The area of the circle is: " + circlearea);
	            break;
		case 2:
			   System.out.println("Rectangle:");
			   System.out.print("Enter the length of the rectangle: ");
		       int length = sc.nextInt();
		       System.out.print("Enter the width of the rectangle: ");
		       int width = sc.nextInt();
		       double rectangleArea = length * width;
		       System.out.println("The area of the rectangle is: " + rectangleArea);
		       break;

	    case 3:
	           System.out.print("Enter the base of the triangle: ");
	           int base = sc.nextInt();
	           System.out.print("Enter the height of the triangle: ");
	           int height = sc.nextInt();
	           double triangleArea = 0.5 * base * height;
	           System.out.println("The area of the triangle is: " + triangleArea);
	           break;

	    case 4: 
	           System.out.print("Enter the side length of the square: ");
	           int side = sc.nextInt();
	           double squareArea = side * side;
	           System.out.println("The area of the square is: " + squareArea);
	           break;

	            
		}

		}
	}


