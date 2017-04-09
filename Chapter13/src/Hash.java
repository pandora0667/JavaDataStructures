import java.math.BigInteger;

/**
 * Created by seongwonlee on 2017. 4. 9..
 */
public class Hash {
    private String[] names;
    private String[] slotState;
    private int primeNumber;

    public Hash(int length) {
        this.names = new String[length];
        this.slotState = new String[length];
        this.primeNumber = 7;
        slotStateInit();
    }

    private void slotStateInit() {
        for (int i=0; i<slotState.length; i++) {
            slotState[i] = "EMPTY";
        }
    }

    public void insert(int key, String name) {
        names[setHashFunction(key)] = name;
        slotState[setHashFunction(key)] = "INUSE";
    }

    private int setHashFunction(int key) {
        int hashValue = (key % names.length);

        if (slotState[hashValue].equals("EMPTY") || slotState[hashValue].equals("INUSE")) {
            return hashValue;
        } else {
            hashValue = 1 + (key % primeNumber);
            return hashValue;
        }
    }

    public void search(int key) {
        if (names[setHashFunction(key)] != null) {
            System.out.println("탐색결과 : " + names[setHashFunction(key)]);
        } else {
            System.out.println("검색결과가 존재하지 않습니다.");
        }
    }

    public boolean delete(int key) {
        names[setHashFunction(key)] = null;
        slotState[setHashFunction(key)] = "DELETE";

        return true;
    }
}
