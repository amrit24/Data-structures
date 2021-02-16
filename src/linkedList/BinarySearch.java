package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class BinarySearch {
	
	private static boolean binarySearch(Node head, int data) {
		Node first = head;
		Node last = null;
		
		while(last != null || first != last) {
			Node middle = middleNode(first, last);
			
			if(middle.data == data) {
				return true;
			}else if(middle.data > data) {
				last = middle.next;
			}else {
				first =  middle;
			}
		}
		
		return false;
	}
	
	static Node middleNode(Node start, Node last) 
	{ 
		if (start == null) 
			return null; 

		Node slow = start; 
		Node fast = start.next; 

		while (fast != last && fast.next!=last) 
		{ 
			slow = slow.next; 
			fast = fast.next.next; 
		} 
		return slow; 
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
		
		System.out.println("Enter the data to be searched");
		int data = sc.nextInt();
		sc.close();

		
		System.out.println("Data found : "+binarySearch(LinkedList.getHead(), data));
	}
}
