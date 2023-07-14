package com.velocity.calculator;

import java.util.Scanner;
//implementation class
//implementing all the interfaces together
public class Calculation implements Addition, Subtraction, Multiplication, Division, Modulus, Square, Cube, Average, Factors, EvenOdd  {
	
	public int a;
	public int b;
	public int c;
	public int d;
	public int e;
	
	public Calculation selectOperation(){	
		    System.out.println("Hello, Welcome to the Console Based Calculator");
		    System.out.println("--------------------------------------------------");
			char yn = 'y';
			do {
			System.out.println("Please Select the operation");
			System.out.println("1. Addition of two numbers\t\t2. Subtraction of two numbers\t\t3. Multiplication of two numbers\n4. Division of two numbers\t\t5. Modulus of two numbers\t\t6. Square of a number\n7. Cube of a number\t\t\t8. Average of numbers\t\t\t9. Factors of numbers\n10. Find out even or odd number");
			System.out.println("");
			Scanner scanner = new Scanner(System.in);
			int number = scanner.nextInt();
			System.out.println("");
			switch(number){
				case 1:
					System.out.println("You selected Addition ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the first number ");
					this.a = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.b = scanner.nextInt();
					this.getAddition(a, b);
					break;
				case 2: 
					System.out.println("You selected Subtraction ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the first number ");
					this.a = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.b = scanner.nextInt();
					this.getSubtraction(a, b);
					break;
				case 3:
					System.out.println("You selected Multiplication ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the first number ");
					this.a = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.b = scanner.nextInt();
					this.getMultiplication(a, b);
					break;
				case 4:
					System.out.println("You selected Division ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the first number ");
					this.a = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.b = scanner.nextInt();
					this.getDivision(a, b);
					break;
				case 5:
					System.out.println("You selected Modulus ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the first number ");
					this.a = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.b = scanner.nextInt();
					this.getModulus(a, b);
					break;
				case 6:
					System.out.println("You want to find the square of any number ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the number ");
					this.a = scanner.nextInt();
					this.getSquare(a);
					break;
				case 7:
					System.out.println("You want to find the cube of any number ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the number ");
					this.a = scanner.nextInt();
					this.getCube(a);
					break;
				case 8:
					System.out.println("You want to find an average of numbers but this calculator needs exact 5 numbers from you to find average ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the first number ");
					this.a = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.b = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.c = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.d = scanner.nextInt();
					System.out.println("Enter the second number ");
					this.e = scanner.nextInt();
					this.getAverage(a, b, c, d, e);
					break;
				case 9:
					System.out.println("You want to find the factors of any number ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the number ");
					this.a = scanner.nextInt();
					this.getFactors(a);
					break;
				case 10:
					System.out.println("You want to know if the number is even or odd ");
					System.out.println("--------------------------------------------------");
					System.out.println("Enter the number ");
					this.a = scanner.nextInt();
					this.getEvenOdd(a);
					break;
				default:
					System.out.println("Invalid Option, Please select Valid option");
			}
			System.out.println("Do you want to use another operation? Enter Y or N");
			yn = scanner.next().charAt(0);
			}while(yn == 'y');
			if (yn == 'n') {
				System.out.println("Thank you for using calculator.");
			}
			Calculation ret = new Calculation();
			return ret;
			
		}
		
		@Override
		public int getAddition(int a, int b) {
			System.out.println("The addition of "+a+" & "+b+" is "+(a + b));
			System.out.println("--------------------------------------------------");
			return a+ b;
			
		}

		@Override
		public int getSubtraction(int a, int b) {
			System.out.println("The subtraction of "+a+" & "+b+" is "+(a - b));
			System.out.println("--------------------------------------------------");
			return a - b;
		}

		@Override
		public int getMultiplication(int a, int b) {
			System.out.println("The multiplication of "+a+" & "+b+" is "+(a * b));
			System.out.println("--------------------------------------------------");
			return a * b;
		}

		@Override
		public int getDivision(int a, int b) {
			System.out.println("The division of "+a+" & "+b+" is "+(a / b));
			System.out.println("--------------------------------------------------");
			return a / b;
		}

		@Override
		public int getModulus(int a, int b) {
			System.out.println("The division of "+a+" & "+b+" is "+(a % b));
			System.out.println("--------------------------------------------------");
			return a % b;
		}
		
		@Override
		public int getSquare(int a){
			System.out.println("The square of "+a+" is "+(a * a));
			System.out.println("--------------------------------------------------");
			return a * a;
		}
		@Override
		public int getCube(int a){
			System.out.println("The cube of "+a+" is "+(a * a * a));
			System.out.println("--------------------------------------------------");
			return a * a * a;
		}
		@Override
		public int getAverage(int a, int b, int c, int d, int e) {
			int sum  = a + b + c + d + e;
			int avrg = sum/5;
			System.out.println("The average of "+a+", "+b+", "+c+", "+d+", "+" & "+e+" is "+avrg);
			System.out.println("--------------------------------------------------");
			return avrg;
		}
		@Override
		public void getFactors(int a) {
			System.out.println("the factors of "+a+" are ");
			for(int i = 1; i<=a; i++) {
				if(a%i == 0) {
					System.out.println(i);
				}
			}
			System.out.println("--------------------------------------------------");
		}
		@Override
		public int getEvenOdd(int a) {
			if(a%2 == 0) {
			System.out.println(+a+" is even number");
			System.out.println("--------------------------------------------------");
			}
			else {
				System.out.println(+a+" is odd number");
				System.out.println("--------------------------------------------------");
			}
			return a * a * a;
		}
		
	}



