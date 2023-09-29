package com.pagobject;

 
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Category {
	    private String name;
	    private List<String> items;

	    public Category(String name) {
	        this.name = name;
	        this.items = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public void addItem(String item) {
	        items.add(item);
	    }

	    public List<String> getItems() {
	        return items;
	    }
	}

	public class CategoryManagement {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Category> categories = new ArrayList<>();

	        while (true) {
	            System.out.println("Category Management System");
	            System.out.println("1. Create a new category");
	            System.out.println("2. Add an item to a category");
	            System.out.println("3. List all categories");
	            System.out.println("4. Quit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter the name of the category: ");
	                    String categoryName = scanner.nextLine();
	                    categories.add(new Category(categoryName));
	                    System.out.println("Category '" + categoryName + "' created.");
	                    break;
	                case 2:
	                    if (categories.isEmpty()) {
	                        System.out.println("No categories exist. Create a category first.");
	                    } else {
	                        System.out.println("Select a category:");

	                        for (int i = 0; i < categories.size(); i++) {
	                            System.out.println((i + 1) + ". " + categories.get(i).getName());
	                        }

	                        int categoryChoice = scanner.nextInt();
	                        scanner.nextLine(); // Consume newline

	                        if (categoryChoice >= 1 && categoryChoice <= categories.size()) {
	                            Category selectedCategory = categories.get(categoryChoice - 1);
	                            System.out.print("Enter the name of the item: ");
	                            String itemName = scanner.nextLine();
	                            selectedCategory.addItem(itemName);
	                            System.out.println("Item '" + itemName + "' added to category '" + selectedCategory.getName() + "'.");
	                        } else {
	                            System.out.println("Invalid category selection.");
	                        }
	                    }
	                    break;
	                case 3:
	                    if (categories.isEmpty()) {
	                        System.out.println("No categories exist.");
	                    } else {
	                        System.out.println("List of categories:");
	                        for (Category category : categories) {
	                            System.out.println(category.getName() + " - Items: " + category.getItems());
	                        }
	                    }
	                    break;
	                case 4:
	                    System.out.println("Exiting the Category Management System.");
	                    scanner.close();
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }
	}


}
