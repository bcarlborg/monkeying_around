public class BalancedTree {

    public static TreeNode createMinTree(int arr[]) {
        TreeNode root = recursiveMinTree(arr, 0, arr.length - 1);
        return root;
    }

    private static TreeNode recursiveMinTree(int arr[], int start, int end) {
        if (end < start) {
            return null;
        }

        int middle = (start + end) / 2;

        TreeNode center = new TreeNode(arr[middle]);

        center.leftChild = recursiveMinTree(arr, start, middle - 1);
        center.rightChild = recursiveMinTree(arr, middle + 1, end);

        return center;

    }
}
