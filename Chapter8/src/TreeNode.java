/**
 * Created by seongwonlee on 2017. 3. 12..
 */
public class TreeNode {
    private int data;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
        this.left = null;
        this.right = null;
    }

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }
}
