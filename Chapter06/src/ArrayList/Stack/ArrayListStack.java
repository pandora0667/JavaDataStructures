package ArrayList.Stack;

/**
 * Created by jusk2 on 2017-02-06.
 */
public class ArrayListStack {
  private ArrayListStackNode[] arrayListStackNodes;
  private int top;

  public ArrayListStack(int length) {
    arrayListStackNodes = new ArrayListStackNode[length];
    top = -1;
  }

  public ArrayListStackNode peek() {
    return arrayListStackNodes[top];
  }

  public boolean push(ArrayListStackNode newNode) {
    try {
      arrayListStackNodes[++top] = newNode;
      return true;
    } catch (ArrayIndexOutOfBoundsException e) {
      top = arrayListStackNodes.length - 1;
      return false;
    }
  }

  public ArrayListStackNode pop() {
    try {
      return arrayListStackNodes[top--];
    } catch (ArrayIndexOutOfBoundsException e) {
      top = -1;
      return null;
    }
  }
}
