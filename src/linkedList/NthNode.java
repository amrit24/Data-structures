package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class NthNode {
	
	private static int nthNode(Node head, int index) {
		if(head == null) return -1;
		if(index == 0) return head.data;
		
		int count = 0;
		Node temp = head;
		
		while(temp!= null && count!=index) {
			temp=temp.next;
			count++;
		}
		
		if(index > count) return -1;
		
		return temp.data;
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
		
		System.out.println("\nEnter the index");
		int index = sc.nextInt();
		sc.close();
		
		int val = nthNode(LinkedList.getHead(), index);
		
		if(val>=0) System.out.println("Value at index "+index+ " is "+val);
		else System.out.println("Not found");
	}
}
