package Chaining;

/**
 * Created by seongwonlee on 2017. 4. 9..
 */
public class LinkedHash {
    private String value;
    private int key;
    private LinkedHash next;

    public LinkedHash(int key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public LinkedHash getNext() {
        return next;
    }

    public void setNext(LinkedHash next) {
        this.next = next;
    }
}
