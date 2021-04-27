package linklist;

public class Add {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		list.print();
		

	}
}

class MyLinkedList {

	private Node head;

	public void addFront(int data) {
		Node newNode = new Node(data);
		

	}
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

	}

	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " = > ");
			current = current.next;
		}

	}

}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}
}