package linkedList;

import java.util.Scanner;
import java.util.Stack;

import linkedList.LinkedList.Node;

public class CheckPalindrome {
	
	private static boolean isPalindrome(Node head) {
		if(head == null) return false;
		boolean isPalindrome = true;
		Node temp = head;
		Stack<Integer> stack = new Stack<>();
		
		while(temp!=null) {
			stack.push(temp.data);
			temp = temp.next;
		}
		
		Node ptr = head;
		
		while(ptr!=null) {
			if(stack.pop() != ptr.data) return false;
			ptr= ptr.next;
		}
		
		return isPalindrome;
	}

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				LinkedList.insertBegining(sc.nextInt());
			} else {
				if (sc.next().equalsIgnoreCase("q")) {
					sc.close();
					break;
				}
			}
		}
		System.out.print("String is Palindrome : ");
		System.out.println(isPalindrome(LinkedList.getHead()));
	}
}
