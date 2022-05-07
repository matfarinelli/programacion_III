package practico1_1;

public class Node {

	private Integer info;
	private Node next;

	public Node() {
		this.info = null;
		this.next = null;
	}
	
	public Node(Integer info, Node next) {
		this.setInfo(info);
		this.setNext(next);
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getInfo() {
		return info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}
	 
}
