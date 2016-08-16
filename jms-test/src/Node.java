public class Node {
	int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	public void addToTail(int d) {
		Node node = new Node(d);
		Node current = this;
		
		while (current.next != null) {
			current = current.next;
		}
		
		current.next = node;
	}
	
	public static void print(Node n) {
		Node current = n;
		while (current != null) {
			System.out.print(current.data + ", ");
			current = current.next;
		}
		
		System.out.println();
	}
}
