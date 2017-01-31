package DoublyLinkedList;

/**
 * Created by jusk2 on 2017-01-31.
 */
public class DoublyLinkedListNode {
 //Field
  private int data;
  private DoublyLinkedListNode next;
  private DoublyLinkedListNode prev;

  //Constructor
 public DoublyLinkedListNode() {
  data = -1;
 }
 public DoublyLinkedListNode(int data) {
  this.data = data;
 }

 //Class
 public int getData() {
  return data;
 }

 public void setNext(DoublyLinkedListNode next) {
  this.next = next;
 }

 public DoublyLinkedListNode getNext() {
  return next;
 }

 public void setPrev(DoublyLinkedListNode prev) {
  this.prev = prev;
 }

 public DoublyLinkedListNode getPrev() {
  return prev;
 }
}

