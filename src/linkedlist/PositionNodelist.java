package linkedlist;



public class PositionNodelist {
	public static void main(String args[]) {
		
				AddPositionlist list = new AddPositionlist();

				list.insertfront(11);
				list.insertfront(22);
				list.insertfront(33);
				list.insertfront(44);

				list.print();
			}

			public void insertfront(int data) {

				Node new_node = new Node(data);

				new_node.next = head;

				head = new_node;
			}

			public void print() {
				
				Node last = head;
				while (last != null) {
					 
					System.out.println(last.data +  " ");
					last = last.next;
					
					
					
				}
				
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


