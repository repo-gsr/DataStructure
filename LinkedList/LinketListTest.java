package LinkedList;

public class LinketListTest {
	public static void main(String[] args) {
		CustomeLinkedList clist = new CustomeLinkedList();
		
		clist.add("subbareddy");
		
		clist.add("gangala");
		
		clist.display();
		
		clist.removeElement("subbareddy");
		
		clist.display();
	}

}
