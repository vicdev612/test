import java.util.HashSet;

/**
 * Remove Dups:
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP: How would you solve this problem if a temporary buffer is not allowed?
 */

public class A2_1 {
	public static void main(String[] args) {
		Node head = new Node(0);
		head.addToTail(0);
		head.addToTail(2);
		head.addToTail(3);
		head.addToTail(1);
		head.addToTail(2);
		head.addToTail(3);
		head.addToTail(1);
		head.addToTail(2);
		head.addToTail(3);
		
		Node.print(head);
		System.out.println("=============");
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(head.data);
		Node previous = head;
		Node current = previous.next;
		
		while (current != null) {
			if (!hashSet.contains(current.data)) {
				hashSet.add(current.data);
				
				previous = current;
				current = current.next;
			} else {
				current = current.next;
				previous.next = current;
			}
		}
		
		Node.print(head);
	}
}
