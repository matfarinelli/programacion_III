/*
public class Tree {

    private int value;
    private Tree leftTree;
    private Tree rightTree;

    public Tree(int value) {
        this.value = value;
        this.leftTree = null;
        this.rightTree = null;
    }

    public Tree(int value, Tree left, Tree right) {
        this.value = value;
        this.leftTree = left;
        this.rightTree = right;
    }

    public int getRoot(){
        //aj!
    }

    public void add(int newValue) {
        if (newValue < this.value) {
            if (this.leftTree == null) {
                Tree newLeft = new Tree(newValue);
            } else {
                this.leftTree.add(newValue);
            }
        } else {
            if (this.rightTree == null) {
                Tree newRight = new Tree(newValue);
            } else {
                this.rightTree.add(newValue);
            }
        }
    }

}
*/