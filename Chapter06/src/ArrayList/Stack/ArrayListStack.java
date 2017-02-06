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

  public ArrayListStackNode stackPeek() {
    return arrayListStackNodes[top-1];
  }

  public boolean stackPush(ArrayListStackNode newNode) {
    try {
      arrayListStackNodes[++top] = newNode;
      return true;
    } catch (ArrayIndexOutOfBoundsException e) {
      return false;
    }
  }

  public ArrayListStackNode stackPop() {
    try {
      return arrayListStackNodes[--top];
    } catch (ArrayIndexOutOfBoundsException e) {
      return null;
    }
  }
}
