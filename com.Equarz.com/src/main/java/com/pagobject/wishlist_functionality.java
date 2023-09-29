package com.pagobject;

public class wishlist_functionality {
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Item {
	    private String name;
	    private double price;

	    public Item(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    @Override
	    public String toString() {
	        return name + " - $" + price;
	    }
	}

	class Wishlist {
	    private List<Item> items = new ArrayList<>();

	    public void addItem(Item item) {
	        items.add(item);
	    }

	    public void removeItem(Item item) {
	        items.remove(item);
	    }

	    public void displayWishlist() {
	        if (items.isEmpty()) {
	            System.out.println("Your wishlist is empty.");
	        } else {
	            System.out.println("Your Wishlist:");
	            for (Item item : items) {
	                System.out.println(item);
	            }
	        }
	    }
	}

	public class WishlistApp {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Wishlist wishlist = new Wishlist();

	        while (true) {
	            System.out.println("\nWishlist Menu:");
	            System.out.println("1. Add Item to Wishlist");
	            System.out.println("2. Remove Item from Wishlist");
	            System.out.println("3. View Wishlist");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item name: ");
	                    String itemName = scanner.nextLine();
	                    System.out.print("Enter item price: ");
	                    double itemPrice = scanner.nextDouble();
	                    Item newItem = new Item(itemName, itemPrice);
	                    wishlist.addItem(newItem);
	                    System.out.println(itemName + " has been added to your wishlist.");
	                    break;
	                case 2:
	                    wishlist.displayWishlist();
	                    System.out.print("Enter the name of the item to remove: ");
	                    String itemToRemove = scanner.nextLine();
	                    for (Item item : wishlist.getItems()) {
	                        if (item.getName().equalsIgnoreCase(itemToRemove)) {
	                            wishlist.removeItem(item);
	                            System.out.println(item.getName() + " has been removed from your wishlist.");
	                            break;
	                        }
	                    }
	                    break;
	                case 3:
	                    wishlist.displayWishlist();
	                    break;
	                case 4:
	                    System.out.println("Exiting Wishlist App. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }
	    }
	}

}
