package ArrayList.Stack;

/**
 * Created by jusk2 on 2017-02-06.
 */
public class ArrayListStackNode {
  //field
  private int data;

  //Constructor
  public ArrayListStackNode() {
    data = 0;
  }

  public ArrayListStackNode(int data) {
    this.data = data;
  }

  //Class
  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }
}
