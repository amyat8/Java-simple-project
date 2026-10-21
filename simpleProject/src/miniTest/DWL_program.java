package miniTest;

import java.util.Scanner;
public class DWL_program {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1,num2,result =0;
		
		char operator,status;
		do {
			boolean invalidOperator = false;
			
			System.out.print("Hello: Enter num1: ");
			num1 = input.nextDouble();
			
			System.out.print("Enter num2: ");
			num2 = input.nextDouble();
			
			System.out.print("Enter operator(+ - * /): ");
			operator = input.next().charAt(0);
			
			if (operator == '+') {
				result = num1+num2;
			}
			else if(operator == '-') {
				result = num1-num2;
			}
			else if(operator == '*') {
				result = num1*num2;
			}
			else if(operator == '/') {
				result = num1/num2;
			}
			else {
				result = 0.0;
				invalidOperator = true;
			}
			if(invalidOperator) {
				System.out.println("invalid Operator");
			}
			else {
			
			System.out.printf("%.2f %c %.2f = %.2f\n ",num1,operator,num2, result);
			
			}
			System.out.print("Do you want to continue the program(Y/n)?: ");
			status = input.next().charAt(0);
			
		}while(status != 'n');
		
		input.close();
	}
	
	

}
