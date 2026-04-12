public class Problem5 {
    public static void main(String[] args) {
        //input
        String[] input = {"zero", "size", "nutella", "jojo", "luna", "isse", "astor", "as", "entretien", "", "cal"};
        int input2 = 3;
        //output
        for (String string : findStrings(input, input2)) {
            System.out.println(string);
        }
    }

    public static String[] findStrings(String[] maxHeap, int lengthLimit) {
        //find all valid strings
        String[] foundStrings = new String[maxHeap.length];
        int numberFound = 0;
        if (maxHeap.length > 0) {
            numberFound = recursion(maxHeap, foundStrings, 0, lengthLimit);
        }

        //clear empty spaces in array
        String[] onlyFoundStrings = new String[numberFound];
        int index = 0;
        for (String string : foundStrings) {
            if (string != null && index < numberFound) {
                onlyFoundStrings[index] = string;
                index++;
            }
        }
        return onlyFoundStrings;
    }

    private static int recursion(String[] maxHeap, String[] foundStrings, int currentNodeIndex, int lengthLimit) {
        int numberFound = 0;

        //check current node
        String currentNode = maxHeap[currentNodeIndex];
        if (currentNode.length() < lengthLimit) {
            foundStrings[currentNodeIndex] = currentNode;
            numberFound++;
        }

        //check child nodes
        int leftChildIndex = currentNodeIndex * 2 + 1;
        int rightChildIndex = currentNodeIndex * 2 + 2;
        if (leftChildIndex < maxHeap.length && maxHeap[leftChildIndex] != null) {
            numberFound += recursion(maxHeap, foundStrings, leftChildIndex, lengthLimit);
        }
        if (rightChildIndex < maxHeap.length && maxHeap[rightChildIndex] != null) {
            numberFound += recursion(maxHeap, foundStrings, rightChildIndex, lengthLimit);
        }

        return numberFound;
    }
}
