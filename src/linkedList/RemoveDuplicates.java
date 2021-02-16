package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class RemoveDuplicates {

	private static Node removeDuplicates(Node head) {
		if (head == null)
			return null;
		Node curr = head;

		/* Traverse list till the last node */
		while (curr != null) {
			Node temp = curr.next;
			/*
			 * Compare current node with the next node and keep on deleting them until it
			 * matches the current node data
			 */
			while (temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			/*
			 * Set current node next to the next different element denoted by temp
			 */
			curr.next = temp;
			curr = curr.next;
		}

		return head;
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

		System.out.print("Distinct ");

		Traversal.printList(removeDuplicates(LinkedList.getHead()));
	}
}
