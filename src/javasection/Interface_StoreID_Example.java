package javasection;

interface Member {
	public void callback();

}

class store {
	Member mem[] = new Member[10];
	int count = 0;

	void register(Member m) {
		mem[count++] = m;
	}

	void inviteSale() {
		for (int i = 0; i < count; i++)
			mem[i].callback();
	}
}

class Customer implements Member {
	String name;

	Customer(String n) {
		name = n;
	}

	public void callback() {
		System.out.println("ok, i will visit," + name);
	}
}

public class Interface_StoreID_Example {
public static void main(String args[])
{
	store s=new store();
	Customer c=new Customer("Mubin");
	Customer c2=new Customer("Wagya");
	s.register(c);
	s.register(c2);
	s.inviteSale();
	
	}
}
