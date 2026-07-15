package simpleCalculator;
import java.util.Scanner;
public class calculator {
	

	    static Scanner sc = new Scanner(System.in);

	    public static void addition() {
	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();

	        System.out.println("Result = " + (a + b));
	    }

	    public static void subtraction() {
	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();

	        System.out.println("Result = " + (a - b));
	    }

	    public static void multiplication() {
	        System.out.print("Enter first number: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        double b = sc.nextDouble();

	        System.out.println("Result = " + (a * b));
	    }

	    public static void division() {
	        try {
	            System.out.print("Enter first number: ");
	            double a = sc.nextDouble();

	            System.out.print("Enter second number: ");
	            double b = sc.nextDouble();

	            if (b == 0) {
	                throw new ArithmeticException("Cannot divide by zero.");
	            }

	            System.out.println("Result = " + (a / b));

	        } catch (ArithmeticException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public static void main(String[] args) {

	        int choice;

	        do {

	            System.out.println("\n===== SIMPLE CALCULATOR =====");
	            System.out.println("1. Addition");
	            System.out.println("2. Subtraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    addition();
	                    break;

	                case 2:
	                    subtraction();
	                    break;

	                case 3:
	                    multiplication();
	                    break;

	                case 4:
	                    division();
	                    break;

	                case 5:
	                    System.out.println("Thank you for using Calculator.");
	                    break;

	                default:
	                    System.out.println("Invalid Choice.");
	            }

	        } while (choice != 5);

	    }
	}

