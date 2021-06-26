package exception;

import java.util.*;

public class add_sub_multiply {
	public static void main(String[] args) {
		while (true) {

			System.out.println("Enter 1 for add");
			System.out.println("Enter 2 for Subs");
			System.out.println("Enter 3 for Divide");
			System.out.println("Enter 4 for Muitiply");
			System.out.println("Enter 5 for Exit App");

			Scanner sc = new Scanner(System.in);
			

			String userOperation = sc.nextLine();
			//System.out.println(userOperation);

			switch (userOperation)
{
			case "1":

				System.out.println("......Add a Number......");
				System.out.println("**Please Enter firstNumber**");
				String firstNumber = sc.nextLine();
				System.out.println("**Please Enter SecondNumber**");
				String secondNumber = sc.nextLine();
				int addResult = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
				System.out.println("==== Addition result =" + addResult);
				break;
			case "2":
			System.out.println(".......Substract a Number.......");
				System.out.println("*Please Enter firstNumber*");
				String firstNumber1 = sc.nextLine();
				System.out.println("*Please Enter SecondNumber*");
				String secondNumber1 = sc.nextLine();
				int addResult1 = Integer.parseInt(firstNumber1) - Integer.parseInt(secondNumber1);
				System.out.println("====Substraction result =" + addResult1);
				break;
			case "3":
				System.out.println("......Divide a Number......");
				System.out.println("*Please Enter firstNumber*");
				String firstNumber2 = sc.nextLine();
				System.out.println("*Please Enter SecondNumber*");
				String secondNumber2 = sc.nextLine();
				int addResult2 = Integer.parseInt(firstNumber2) / Integer.parseInt(secondNumber2);
				System.out.println("====Division result =" + addResult2);
				break;
			case "4":
				System.out.println("......Multiply a Number......");
				System.out.println("*Please Enter firstNumber*");
				String firstNumber3 = sc.nextLine();
				System.out.println("*Please Enter SecondNumber*");
				String secondNumber3 = sc.nextLine();
				int addResult3 = Integer.parseInt(firstNumber3) * Integer.parseInt(secondNumber3);
				System.out.println("====Multiplication result =" + addResult3);
				break;
			case "5":
				System.out.println("Exit Application........");
				System.out.println("!!!!!Thankyou for using Application!!!!!!");
				System.exit(5);
				
			default:
				System.out.println("######Invalid Input######");
			}
		
	}}

}
