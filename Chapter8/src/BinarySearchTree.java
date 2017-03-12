/**
 * Created by seongwonlee on 2017. 3. 12..
 */
public class BinarySearchTree {
    private TreeNode root = new TreeNode();

    public TreeNode insert(TreeNode root, int data) {
        TreeNode tmpNode = root;
        TreeNode newNode = new TreeNode(data);

        if (tmpNode == null) {
            return newNode;
        } else if(tmpNode.getData() > newNode.getData()) {
            tmpNode.left = insert(tmpNode.left, data);
            return tmpNode;
        } else if(tmpNode.getData() < newNode.getData()) {
            tmpNode.right = insert(tmpNode.right, data);
            return tmpNode;
        } else {
            return tmpNode;
        }
    }

    public void insert(int data) {
        insert(root, data);
    }

    public TreeNode search(int data) {
        TreeNode tmpNode = root;
        while(tmpNode != null){
            if (data < tmpNode.getData()) {
                tmpNode = tmpNode.left;
            }
            else if(data > tmpNode.getData()) {
                tmpNode = tmpNode.right;
            }
            else {
                return tmpNode;
            }
        }
        return tmpNode;
    }

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.getData() + " ");
            inorder(root.right);
        }
    }

    public void print() {
        inorder(root);
        System.out.println();
    }
}
