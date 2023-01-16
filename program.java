

import java.util.Scanner;

public class javaTypesHW {

	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);
	
		System.out.println("Enter Two Numbers (x y):");
		
		double first = input.nextDouble();
		double second = input.nextDouble();
		
		System.out.print("Enter an Operator. ( +, -, *, /:)");
		
		String operator = input.next();
		
		double result; 
		
		switch(operator) {
	
			case "+":
				result = first + second; 
			break; 
			
			case "-":
				result = first - second;
			break;
			
			case "*":
				result = first * second;
			break;
			
			case "/":
				result = first / second; 
			break;
			
		default:
		
			System.out.println("Error: Select an Operator");
			
			return;
		}
		
		System.out.println(first);
		System.out.println(operator);
		System.out.println(second);
		System.out.println("=");
		System.out.println(result);
		
				//why couldnt i get this all on one line?
        
	
	}
}


