package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class LoopLength {

	public static int loopLen(Node head) {
		if (head == null)
			return 0;

		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return count(slow);	
			}
		}

		return 0;
	}

	private static int count(Node slow) {
		Node temp = slow;
		int count = 1;
		
		while(temp.next != slow) {
			count++;
			temp = temp.next;
		}
		return count;
	}

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
			head.next.next.next.next = head;
		}
        int len = loopLen(head);
        if(len>0) {
    		System.out.println("Loop found with length: " + len);	
        }else {
        	System.out.println("Loop not found");
        }

	}
}
