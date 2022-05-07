package practico1_8;

public class Node {

	private Integer info;
	private Node next;
	private Node prev;

	public Node() {
		this.info = null;
		this.next = null;
		this.prev = null;
	}
	
	public Node(Integer info, Node next) {
		this.setInfo(info);
		this.setNext(next);
		this.setPrev(null);
	}
	
	public Node(Integer info, Node next, Node prev) {
		this.setInfo(info);
		this.setNext(next);
		this.setPrev(prev);
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrev() {
		return this.prev;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Integer getInfo() {
		return this.info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}
	 
	public void setPrev(Node prev) {
		this.prev = prev;
	}
}
