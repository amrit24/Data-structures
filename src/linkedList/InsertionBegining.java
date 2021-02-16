package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class InsertionBegining {

	static LinkedList list = new LinkedList();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				insertBegining(sc.nextInt());	
			}else {
				if(sc.next().equalsIgnoreCase("q")) {
					sc.close();
					break;
				}
			}
		}
		
		Traversal.printList(getHead());
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
