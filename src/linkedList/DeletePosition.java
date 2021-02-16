package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class DeletePosition {

	private static Node deletePostion(Node head, int position) {
		if(head == null) return null;
	
		Node temp = head;
		
		//if head is to be delete that is position 0
		if(position == 0) {
			head = temp.next;
			return head;
		}
		
		Node prev = null;
		int count = 0;
		
		while(temp != null && count!= position) {
			prev = temp;
			temp = temp.next;
			count++;
		}
		
		//if position is greater than size of linkedlist
		if(count!=position) return head;

		prev.next = temp.next;
		
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
					break;
				}
			}
		}

		Node head = LinkedList.getHead();

		System.out.println("Enter position to be deleted");
		int key = sc.nextInt();

		Node node = deletePostion(head, key);

		sc.close();
		Traversal.printList(node);
	}

}
