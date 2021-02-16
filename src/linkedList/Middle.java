package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class Middle {
	
	public static int getMiddle(Node head) {
		if(head == null) return -1;
		
		Node slow = head;
		Node fast = head;
		
		while(fast!= null  && fast.next != null) {
			slow = slow.next;
			fast =  fast.next.next;
		}
		
		return slow.data;
	
	}
	
	public static Node getMiddleNode(Node head) {
		if(head == null) return null;
		
		Node slow = head;
		Node fast = head;
		
		while(fast!= null  && fast.next != null) {
			slow = slow.next;
			fast =  fast.next.next;
		}
		
		return slow;
	
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
		Traversal.printList(LinkedList.getHead());
		System.out.println("\n\nMiddle of linked list : "+getMiddle(LinkedList.getHead()));
	}

}
