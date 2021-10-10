package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class Reverse {
	
	public static Node reverse(Node head) {
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current=next;
		}
		return prev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				LinkedList.insert(sc.nextInt());
			} else {
				if (sc.next().equalsIgnoreCase("q")) {
					sc.close();
					break;
				}
			}
		}
		
		System.out.println("Before reversal:");
		Traversal.printList(LinkedList.getHead());
		
		//delete Linked list
		Node ns = reverse(LinkedList.getHead());
		System.out.println("\nAfter reversal:");
		Traversal.printList(ns);
	}
}
