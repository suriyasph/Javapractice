package myproj;

import java.util.Scanner;

class funtion {
	double fun( char operator,double... num) {
		double result = 0;
		for(double d:num)
		{
		switch (operator) {
		case '+':
			result+=d;
			break;
		case '-':
			result -=d;
			break;
		case '*':
			result *= d;
			break;
		case '/':
			if (d != 0) {
				result = d / d;
				return result;

			} else {
				System.out.println("Division by zero is not allowed.");
			}
			break;
		default:
			System.out.println("Invalid operator.");
		}
		}
		return result;

	}
}

public class calculator extends funtion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.print("Enter an operator");
		char operator = scan.next().charAt(0);

		System.out.print("Enter the  number: ");
		double num2 = scan.nextDouble();

		calculator o = new calculator();

		System.out.println("Result: " + o.fun(operator,num2,num2));
	}

}
