package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class Search {
	
	//Iterative
	private static boolean searchItr(Node head, int data) {
		if(head==null) return false;
		Node temp = head;
		
		while(temp!=null) {
			if(temp.data==data) return true;
			temp = temp.next;
		}
		
		return false;
		
	}
	
	//Recursive
	private static boolean searchRec(Node head, int data) {
		//base case
		if(head == null) return false;
		
		//if node found return true
		if(head.data == data) return true;
		
		return searchRec(head.next, data);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements of Linked List.Press 'q' to terminate");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				LinkedList.insert(sc.nextInt());
			} else {
				if (sc.next().equalsIgnoreCase("q")) {
					break;
				}
			}
		}
		
		Traversal.printList(LinkedList.getHead());
		
		System.out.println("\nEnter a data to be searched");
		int data = sc.nextInt();
		sc.close();

		System.out.println("Found iteratively: "+searchItr(LinkedList.getHead(), data));
		System.out.println("Found recursively: "+searchRec(LinkedList.getHead(), data));

	}
}
