public class BRTree {
    BRNode root;

    public BRTree() {}

    public void addNode(BRNode node) {
        //empty tree
        if (root == null) {
            root = node;
            return;
        }

        //constantly compares to find the correct position for the node
        BRNode currentNode = root;
        while (currentNode != null) {
            if (node.key < currentNode.key) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = node;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }

        //new nodes start red
        node.isBlack = false;
        //rebalance tree
        balance(node);
    }

    public void balance(BRNode node) {
        //case 1
        if (node.parent == null) {
            node.isBlack = true;
            return;
        }
        if (node.parent.isBlack) {
            return;
        }

        //case 2
    }


}
