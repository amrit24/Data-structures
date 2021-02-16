package linkedList;

import linkedList.LinkedList.Node;

public class InsertionAfter {

	static LinkedList list = new LinkedList();

	public static void main(String[] args) {
		createLinkedList();
		insertAfter(list.head.next,3);
		printList();
	}

	private static void insertAfter(Node prev, int data) {
		Node n = list.head;

		if (n == null)
			return;

		while (n.data != prev.data) {
			n = n.next;
		}

		if (n.data == prev.data) {
			Node newNode = new Node(data);
			newNode.next = n.next;
			n.next = newNode;
		}
	}

	private static void createLinkedList() {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(4);
		Node n4 = new Node(5);

		list.head = n1;
		list.head.next = n2;
		n2.next = n3;
		n3.next = n4;
	}

	private static void printList() {
		Node n = list.head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}

}
