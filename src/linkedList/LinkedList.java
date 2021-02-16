package linkedList;

import java.util.Scanner;

public final class LinkedList {

	Node head;
	
	static LinkedList list = new LinkedList();

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				insert(sc.nextInt());	
			}else {
				if(sc.next().equalsIgnoreCase("q")) {
					sc.close();
					break;
				}
			}
		}
    
		Traversal.printList(getHead());

	}
	

	public static void insert(int data) {
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
	
	public static void insertBegining(int data) {
		Node node = new Node(data);
		node.next = list.head;
		list.head = node;
	}
	
	public static Node getHead () {
		return list.head;
	}

}
