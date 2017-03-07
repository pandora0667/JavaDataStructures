/**
 * Created by jusk2 on 2017-03-06.
 */
public class BinaryTree {
  private BinaryTreeNode root;
  private BinaryTreeNode present;

  public BinaryTree() {
    this.root = null;
    this.present = null;
  }

  public void addRoot(BinaryTreeNode node) {
      root = node;
      present = node;
  }
}
