package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public final class Traversal {

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

		printList(LinkedList.getHead());

	}

	public static void printList(Node head) {
		System.out.println("Linked List:");
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}
