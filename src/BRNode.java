public class BRNode {
    boolean isBlack;
    int key;
    BRNode parent;
    BRNode left;
    BRNode right;

    BRNode() {}

    BRNode(boolean isBlack, int key) {
        this.isBlack = isBlack;
        this.key = key;
    }

    BRNode(boolean isBlack, int key, BRNode parent, BRNode left, BRNode right) {
        this.isBlack = isBlack;
        this.key = key;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }
}
