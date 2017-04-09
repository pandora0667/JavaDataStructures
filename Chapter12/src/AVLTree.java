/**
 * Created by seongwonlee on 2017. 4. 8..
 */
public class AVLTree {
    private AVLNode avlNode = new AVLNode();
    private AVLNode root;

    public AVLTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void makeEmpty() {
        root = null;
    }

    public void insert(int data) {
        root = insert(data, root);
    }

    private int height(AVLNode node) {
        return node == null ? -1 : node.getHeight();
    }

    // Function to max of left / right
    private int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    private AVLNode insert(int data, AVLNode node) {
        if (node == null) {
            node = new AVLNode(data);
        } else if (data < node.getData()) {
            node.setLeft(insert(data, node.getLeft()));

            if (height(node.getLeft()) - height(node.getRight()) == 2) {
                if (data > node.getRight().getData()) {
                    node = rotateWithLeftChild(node);
                } else {
                    node = doubleWithLeftChild(node);
                }
            } else if (data > node.getData()) {
                node.setRight(insert(data, node.getRight()));
                if ((height(node.getRight()) - height(node.getRight())) == 2) {
                    if (data > node.getData()) {
                        node = rotateWithRightChild(node);
                    } else {
                        node = doubleWithRightChild(node);
                    }
                }
            }
        }
        node.setHeight(max(height(node.getLeft()), height(node.getRight()) + 1));
        return node;
    }

    private AVLNode rotateWithLeftChild(AVLNode k2) {
        AVLNode k1 = k2.getRight();
        k2.setRight(k1.getLeft());
        k1.setLeft(k2);
        k2.setHeight(max(height(k2.getLeft()), height(k2.getRight()) + 1));
        k1.setHeight(max(height(k1.getRight()), k2.getHeight()));

        return k1;
    }

    private AVLNode rotateWithRightChild(AVLNode k1) {
        AVLNode k2 = k1.getRight();
        k1.setRight(k2.getLeft());
        k2.setLeft(k1);
        k1.setHeight(max(height(k1.getLeft()), height(k1.getRight()) + 1));
        k2.setHeight(max(height(k2.getRight()), k1.getHeight()));

        return k2;

    }

    private AVLNode doubleWithRightChild(AVLNode k3) {
        k3.setLeft(rotateWithRightChild(k3.getLeft()));
        return rotateWithLeftChild(k3);
    }

    private AVLNode doubleWithLeftChild(AVLNode k1) {
        k1.setRight(rotateWithLeftChild(k1.getRight()));
        return rotateWithRightChild(k1);
    }

    public int countNodes() {
        return countNodes(root);
    }

    private int countNodes(AVLNode node) {
        if (node == null) {
            return 0;
        } else {
            int i = 1;
            i += countNodes(node.getLeft());
            i += countNodes(node.getRight());
            return i;
        }
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(AVLNode node, int val) {
        boolean found = false;
        while ((node != null) && !found) {
            int rval = node.getData();
            if (val < rval) {
                node = node.getLeft();
            } else if (val > rval) {
                node = node.getRight();
            } else {
                found = true;
                break;
            }
        }
        return found;
    }

    public void indore() {
        indore(root);
    }

    private void indore(AVLNode node) {
        if (node != null) {
            indore(node.getLeft());
            System.out.print(node.getData() + " ");
            indore(node.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    private void preorder(AVLNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(AVLNode node) {
        if (node != null) {
            postorder(node.getLeft());
            postorder(node.getRight());
            System.out.print(node.getData() + " ");
        }
    }
}
