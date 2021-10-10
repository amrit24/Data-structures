package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class LoopStart {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				LinkedList.insertBegining(sc.nextInt());
			} else {
				if (sc.next().equalsIgnoreCase("q")) {
					break;
				}
			}
		}

		Node head = LinkedList.getHead();

		System.out.println("Do you want to create a loop ? Press 'Y' for yes 'N' for No");
		String makeLoop = sc.next();
		sc.close();

		if (makeLoop.equalsIgnoreCase("Y")) {
			// create loop with 4
			//always loop length will be 4
			//head.next.next.next.next = head;
			head.next.next.next.next.next = head.next.next;
		}
		
		System.out.println("Loop starting node is "+loopStart(head).data);

	}
	
	private static Node loopStart(Node head) {
		if (head == null)
			return null;

		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				break;
			}
		}
		
		if(slow != fast) 
			return null;
		
		 slow = head;
		
		 while(slow != fast) {
			 slow = slow.next;
			 fast = fast.next;
		 }
		 
		 return slow;
		
	}
	

}
