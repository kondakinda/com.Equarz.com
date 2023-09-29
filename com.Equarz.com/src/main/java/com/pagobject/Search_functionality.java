package com.pagobject;

public class Search_functionality {
	import java.util.Scanner;

	public class SearchProgram {
	    public static void main(String[] args) {
	        // Sample array of strings
	        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

	        // Create a Scanner for user input
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a name to search: ");
	        String searchQuery = scanner.nextLine();

	        // Close the Scanner
	        scanner.close();

	        // Perform the search
	        boolean found = false;
	        for (String name : names) {
	            if (name.equalsIgnoreCase(searchQuery)) {
	                found = true;
	                break;
	            }
	        }

	        // Display the search result
	        if (found) {
	            System.out.println(searchQuery + " was found in the array.");
	        } else {
	            System.out.println(searchQuery + " was not found in the array.");
	        }
	    }
	}


}
