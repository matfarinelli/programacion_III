package practico2_7;

public class TreeNode {

	private Integer info;
	private TreeNode right;
	private TreeNode left;

	public TreeNode() {
		this.info = null;
		this.right = null;
		this.left = null;
	}

	public TreeNode(int info) {
		this.info = info;
		this.right = null;
		this.left = null;
	}
	
	public TreeNode(Integer info, TreeNode right) {
		this.setInfo(info);
		this.setRight(right);
		this.setLeft(null);
	}
	
	public TreeNode(Integer info, TreeNode right, TreeNode left) {
		this.setInfo(info);
		this.setRight(right);
		this.setLeft(left);
	}
	
	public Integer getIRight() {
		return this.right.getInfo();
	}
	
	public Integer getILeft() {
		return this.left.getInfo();
	}

	public TreeNode getRight() {
		return this.right;
	}
	
	public TreeNode getLeft() {
		return this.left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public Integer getInfo() {
		return this.info;
	}

	public void setInfo(Integer info) {
		this.info = info;
	}
	 
	public boolean isLeaf(){
		return ((this.getLeft() == null) && (this.getRight()== null));
	}
}
