package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class Delete {
	
	private static Node deleteLinkedList(Node head) {
		return head = null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				LinkedList.insert(sc.nextInt());
			}else {
				if(sc.next().equalsIgnoreCase("q")) {
					sc.close();
					break;
				}
			}
		}
		
		System.out.println("LinkedList before deletion:");
		Traversal.printList(LinkedList.getHead());
		
		//delete Linked list
		Node head = deleteLinkedList(LinkedList.getHead());
		System.out.println("\nLinkedList after deletion:");
		Traversal.printList(head);

	}
} 
