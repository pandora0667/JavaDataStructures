/**
 * Created by jusk2 on 2017-03-06.
 */
public class BinaryTreeNode {
  private int data;
  private BinaryTreeNode left;
  private BinaryTreeNode right;

  public BinaryTreeNode() {
    this.left = null;
    this.right = null;
  }

  public BinaryTreeNode(int data) {
    this.data = data;
  }

  public void setLeft(BinaryTreeNode left) {
    this.left = left;
  }

  public void setRight(BinaryTreeNode right) {
    this.right = right;
  }

  public int getData() {
    return data;
  }

  public BinaryTreeNode getLeft() {
    return left;
  }

  public BinaryTreeNode getRight() {
    return right;
  }

}
