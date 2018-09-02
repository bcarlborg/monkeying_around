import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

public class ImplementationTest {
    private BalancedTree bt;

    @Test
    public void simplePassing() {
        int arr[] = {0, 1, 2, 3, 4, 5, 6};

        TreeNode root = BalancedTree.createMinTree(arr);
        System.out.println(root.value);

        assertTrue(root.value == 3);
        assertTrue(root.leftChild.value == 1);
        assertTrue(root.rightChild.value == 5);

        assertTrue(root.leftChild.leftChild.value == 0);
        assertTrue(root.leftChild.rightChild.value == 2);

        assertNull(root.leftChild.leftChild.leftChild);
        assertNull(root.leftChild.leftChild.rightChild);

        assertTrue(root.rightChild.leftChild.value == 4);
        assertTrue(root.rightChild.rightChild.value == 6);

        assertNull(root.rightChild.leftChild.leftChild);
        assertNull(root.rightChild.leftChild.rightChild);

    }
}
