package linkedlist;

public class App {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.insertFront(20);
		list.insertFront(2);
		list.insertFront(4);
		list.insertFront(1);
		list.print();
		//int length = list.length();
		//System.out.println("length : " + length);
	}
}

class MyLinkedList {

	private Node head;

	public void insertFront(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertFront(int data,int count) {
	
	}

	public int length() {
		if (head == null) {
			return 0;
		}
		int count = 1;
		Node current = head;
		while (current.next != null) {
			current = current.next;
			count = count + 1;
		}
		return count;

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
