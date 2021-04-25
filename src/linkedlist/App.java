package linkedlist;

public class App {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();

		list.add(100);

		list.add(10);
		list.add(4);
		list.add(8);
		list.add(182);
		list.add(200);

	}
}

class MyLinkedList {

	private Node head;
	public void add(int data) {
		Node newNode = new Node(data);
		head = newNode;
	}

}

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}
}
