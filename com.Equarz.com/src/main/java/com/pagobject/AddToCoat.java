package com.pagobject;

public class AddToCoat 
{
	import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Add elements to the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // Display the stack
        System.out.println("Stack elements: " + stack);

        // Adding an element to the top of the stack
        int elementToAdd = 6;
        stack.push(elementToAdd);

        // Display the stack after adding an element
        System.out.println("Stack elements after adding " + elementToAdd + ": " + stack);
    }
}


}
