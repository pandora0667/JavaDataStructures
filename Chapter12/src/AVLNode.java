/**
 * Created by seongwonlee on 2017. 4. 8..
 */
public class AVLNode {
    private AVLNode left, right;
    private int data;
    private int height;

    public AVLNode() {
        this.left = null;
        this.right = null;
        this.data = 0;
        this.height = 0;
    }

    public AVLNode(int data) {
        left = null;
        right = null;
        this.data = data;
        height = 0;
    }
    public int getHeight() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getData() {
        return data;
    }

    public AVLNode getLeft() {
        return left;
    }

    public AVLNode getRight() {
        return right;
    }

    public void setLeft(AVLNode left) {
        this.left = left;
    }

    public void setRight(AVLNode right) {
        this.right = right;
    }
}
