package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class Length {
	
	private static int lengthItr(Node head) {
		int count = 0;
		
		if(head == null) return count;
		
		Node temp = head;
		
		while(temp!=null) {
			temp = temp.next;
			count++;
		}
		
		return count;
				
	}
	
	private static int lengthRec(Node head) {

		//base case
		if(head == null) return 0;
		
		return 1+lengthRec(head.next);
				
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
		
		System.out.println("\nLength iteratively: "+lengthItr(LinkedList.getHead()));
		System.out.println("Length recursively: "+lengthRec(LinkedList.getHead()));


	}

}
