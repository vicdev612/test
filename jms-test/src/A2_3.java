/**
 * delete middle node:
 * Implement an algorithm to delete a node in the middle of a singly linked list, given only access to that node.
 * 
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 * 
 * solution : use two "pointers", the first iterate through the list
 * and the second moves at half of the speed, ie. it moves one time every
 * second time the first "pointer" moves.
 * 
 * runtime complexity O(N), storage complexity O(1)
 */

public class A2_3 {
	public static void main(String[] args) {
		int len = 7;
		Node head = new Node(0);
		
		for (int i = 1; i < len; i++) {
			head.addToTail(i);
		}
		
		Node.print(head);
		System.out.println("=============");
		
		int size = 0;
		Node current = head;
		while (current.next != null) {
			current = current.next;
			size++;
		}
		
		int mid = (size / 2);
		System.out.println(mid);
		current = head;
		
		for (int i = 1; i < mid; i++) {
			current = current.next;
		}
		
		current.next = current.next.next;
		
		Node.print(head);
	}
}
