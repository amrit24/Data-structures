package linkedList;

import java.util.Scanner;
import linkedList.LinkedList.Node;

public class DeleteKey {
	
	private static Node delete(Node head, int key) {
		if(head == null) return null;
		
		Node temp = head;
		Node prev = null;
		
		//if head has the key
		if(temp!= null && temp.data == key) {
			head = temp.next;
			return head;
		}
		
		while(temp != null && temp.data !=key) {
			prev = temp;
			temp = temp.next;
		}
		
		//key not found
		if(temp == null) {
			return head;
		}
		
		prev.next = temp.next;
		return head;

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
		
		System.out.println("Enter key to be deleted");
        int key = sc.nextInt();
		
		Node node = delete(head, key);
		
	    sc.close();
		Traversal.printList(node);
	}
}
