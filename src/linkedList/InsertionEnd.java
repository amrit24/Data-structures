package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public final class InsertionEnd {

	static LinkedList list = new LinkedList();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				insertEnd(sc.nextInt());	
			}else {
				if(sc.next().equalsIgnoreCase("q")) {
					sc.close();
					break;
				}
			}
		}

		Traversal.printList(getHead());

	}

	public static void insertEnd(int data) {
		Node node = new Node(data);
		node.next = null;

		if (list.head == null) {
			list.head = node;
			return;
		}

		Node last = list.head;

		while (last.next != null) {
			last = last.next;
		}

		last.next = node;
	}
	
	public static Node getHead () {
		return list.head;
	}

}
