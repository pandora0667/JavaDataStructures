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
        } else if (tmpNode.getData() > newNode.getData()) {
            tmpNode.left = insert(tmpNode.left, data);
            return tmpNode;
        } else if (tmpNode.getData() < newNode.getData()) {
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
        while (tmpNode != null) {
            if (data < tmpNode.getData()) {
                tmpNode = tmpNode.left;
            } else if (data > tmpNode.getData()) {
                tmpNode = tmpNode.right;
            } else {
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

    public boolean delete(int id) {
        TreeNode parent = root;
        TreeNode current = root;
        boolean isLeftChild = false;

        while (current.getData() != id) {
            parent = current;
            if (current.getData() > id) {
                isLeftChild = true;
                current = current.getLeft();
            } else {
                isLeftChild = false;
                current = current.getRight();
            }
            if (current == null) {
                return false;
            }
        }

        //Case 1: 자식노드가 없는 경우
        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            }
            if (isLeftChild == true) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } //Case 2 : 하나의 자식을 갖는 경우
        else if(current.getRight()==null){
            if(current==root){
                root = current.getLeft();
            }else if(isLeftChild){
                parent.setLeft(current.getLeft());
            }else{
                parent.setRight(current.getLeft());
            }
        } else if(current.getLeft()==null){
            if(current==root){
                root = current.getRight();
            }else if(isLeftChild){
                parent.setLeft(current.getRight());
            }else{
                parent.setRight(current.getRight());
            }
        }
        else if(current.getLeft()!=null && current.getRight()!=null){
            // 오른쪽 서브트리의 최소값을 찾음
            TreeNode successor = getSuccessor(current);
            if(current==root){
                root = successor;
            }else if(isLeftChild){
                parent.setLeft(successor);
            }else{
                parent.setRight(successor);
            }
            successor.setLeft(current.getLeft());
        }
        return true;
    }

    public TreeNode getSuccessor(TreeNode deleleNode){
        TreeNode successsor =null;
        TreeNode successsorParent =null;
        TreeNode current = deleleNode.getRight();
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.getLeft();
        }
        if(successsor!=deleleNode.getRight()){
            successsorParent.setLeft(successsor.getRight());
            successsor.setRight(deleleNode.getRight());
        }
        return successsor;
    }
}

