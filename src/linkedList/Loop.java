package linkedList;

import java.util.Scanner;
import linkedList.LinkedList.Node;

public class Loop {

	public static boolean detectLoop(Node head) {
		if (head == null)
			return false;

		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;

		}

		return false;
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
			// create loop
			head.next.next.next.next = head;
		}

		System.out.println("Loop found :" + detectLoop(head));

	}
}
