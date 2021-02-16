package stack;

import java.util.Scanner;

public class Stack {

	static int MAX = 1000;
	static int arr[];
	static int top;

	Stack(int size) {
		 top = -1;
		 arr = new int[MAX];
	}

	public static boolean isEmpty() {
		return top < 0;
	}

	public static boolean push(int data) {
		if (top == MAX - 1) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			arr[++top] = data;
			System.out.println("Pushed to stack--> "+data);
			return true;
		}
	}

	public static int pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		System.out.println("Removed element is "+arr[top]);
		return arr[top--];
	}
	
	public static int peek() {
		if (isEmpty()) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		System.out.println("Top element is "+arr[top]);
		return arr[top];		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stack elements.Press 'q' to exit");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				Stack.push(sc.nextInt());
			}else {
				if(sc.next().equalsIgnoreCase("q")) {
					break;
				}
			}
		 }
		
		System.out.println("Chose operation : "
				+ "1) Pop"
				+ "2) Peek");
				
		if(sc.nextInt() == 1) pop(); 
		else peek();
		
		sc.close();
				

	}
	
	
}
