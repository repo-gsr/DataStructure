package LinkedList;

public class CustomeLinkedList {

	Node head;

	public void add(Object data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}

			currentNode.nextNode= newNode;
		}
	}
	
	public void display() {
		Node currentNode = head;
		while(currentNode!=null) {
			System.out.println(currentNode.data);
			currentNode = currentNode.getNextNode();
		}
	}
	
	public void removeElement(Object data) {
		Node currentNode = head, previous = null;
		
		if(currentNode.getData().equals(data)) {
			head = currentNode.getNextNode();
		}else {
			while(currentNode!=null) {
				previous = currentNode;
				currentNode = currentNode.getNextNode();
				if(currentNode.getData().equals(data)){
					previous.setNextNode(currentNode.getNextNode());
				}
			}
		}
		
	}
	

}
