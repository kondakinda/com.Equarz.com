package com.pagobject;

public class Registration_functionsality {
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class RegistrationProgram {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Map<String, String> userDatabase = new HashMap<>();

	        while (true) {
	            System.out.println("Welcome to Registration Program");
	            System.out.print("Enter your username (or 'exit' to quit): ");
	            String username = scanner.nextLine();

	            if (username.equalsIgnoreCase("exit")) {
	                break;
	            }

	            if (userDatabase.containsKey(username)) {
	                System.out.println("Username already exists. Please choose a different one.");
	                continue;
	            }

	            System.out.print("Enter your password: ");
	            String password = scanner.nextLine();

	            userDatabase.put(username, password);
	            System.out.println("Registration successful!");
	        }

	        System.out.println("Thank you for using the Registration Program.");
	    }
	}


}
