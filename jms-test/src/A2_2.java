/**
 * Return Kth to last:
 * Implement an algorithm to find the kth to last element of a singly linked list.
 */
adsfads
public class A2_2 {
	public static int fuc(Node head, int k) {
		if (head == null) {
			return 0;
		}
		
		int index = fuc(head.next, k) + 1;
		System.out.println("k=" + k + ", data=" + head.data);
		if (index == k) {
			System.out.println(k + "  gotcha " + head.data);
		}
		
		return index;
	}
	
	public static void main(String[] args) {
		int len = 10;
		Node head = new Node(0);
		
		for (int i = 1; i < len; i++) {
			head.addToTail(i);
		}
		
		Node.print(head);
		
		int k = 3;
		fuc(head, k);
		
	}
}
