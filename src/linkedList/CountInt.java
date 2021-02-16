package linkedList;

import java.util.Scanner;

import linkedList.LinkedList.Node;

public class CountInt {
	
	private static int count(Node head, int data) {
		if(head == null) return -1;
		
		Node temp = head;
		int count = 0;
		
		while(temp!=null) {
			if(temp.data == data) count++;
			temp= temp.next;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of Linked List.Press 'q' to terminate");
		
		while(sc.hasNext()) {
			if(sc.hasNextInt()) {
				LinkedList.insert(sc.nextInt());	
			}else {
				if(sc.next().equalsIgnoreCase("q")) {
					break;
				}
			}
		}
		
		Node head = LinkedList.getHead();
		Traversal.printList(head);
		
		System.out.println("\nEnter data whose occurence is to be counted");
        int data = sc.nextInt();		
	    sc.close();
	    int count = count(head, data);
	    
	    if(count>0) {
		    System.out.println("\n"+data+" occurs " +count+" times");	
	    }else {
	    	System.out.println("No occurence of "+data+" found in linked list");
	    }
	}

}
