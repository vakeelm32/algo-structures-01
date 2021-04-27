package linkedlist;

public class Addfrontlist {
	public static void main(String args[]) {
//creating a linkedlist
		Addfrontlist l = new Addfrontlist();

		l.insertfront(11);
		l.insertfront(22);
		l.insertfront(33);
		l.insertfront(44);

		l.print();
	}

	public void insertfront(int data) {

		Node new_node = new Node(data);

		new_node.next = head;

		head = new_node;
	}

	public void print() {
		int count = 0;
		Node last = head;
		while (last != null) {
			 
			System.out.println(last.data +  " ");
			last = last.next;
			//System.out.println( count);
			count = count + 1;
		}
		System.out.println("Length of an node is::" +count);
	}

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
}