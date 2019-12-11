package lib;

public class Node {
    public Node right;
    public Node left;
    private int data;

    public Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }

    public void insert(int data) {

        if (data <= this.data) {
            if (this.left == null) {
                this.left = new Node(data);
            }else {
                this.left.insert(data);
            }
        }else {
            if (this.right == null) {
                this.right = new Node(data);
            }else {
                this.right.insert(data);
            }
        }
    }
}
