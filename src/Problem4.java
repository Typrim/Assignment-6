public class Problem4 {
    private final static int EMPTY = -1;
    private final static int ROOT_INDEX = 0;
    private final static int ROOT_VALUE = 1;

    public static void main(String[] args) {
        //input
        int[] array = {-2,-2,-2,-1,-2,-2,-2,-1,-1,-2,-2,-1,-1,-2,-2};
        int target = 43;

        //output
        System.out.println(hasTarget(array, target));
    }

    public static boolean hasTarget(int[] encryptedTree, int target) {
        //search for target
        return recursiveSearch(encryptedTree, target, ROOT_INDEX, ROOT_VALUE);
    }

    public static boolean recursiveSearch(int[] encryptedTree, int target, int index, int value) {
        //check if out of bounds
        if (index >= encryptedTree.length) {
            return false;
        }

        //check if part of tree
        if (encryptedTree[index] == EMPTY) {
            return false;
        }

        //compare target to node
        if (target == value) {
            return true;
        }

        //recursive call onto left and right children
        int leftIndex = index * 2 + 1;
        int leftValue = value * 3 + 1;
        int rightIndex = index * 2 + 2;
        int rightValue = value * 2 + 5;

        return recursiveSearch(encryptedTree, target, leftIndex, leftValue) || recursiveSearch(encryptedTree, target,
                rightIndex, rightValue);
    }
}
