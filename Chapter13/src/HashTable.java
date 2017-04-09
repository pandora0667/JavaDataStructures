import java.util.Scanner;

/**
 * Created by seongwonlee on 2017. 4. 9..
 */
public class HashTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hash hash = new Hash(10);



        System.out.print("학번 -> ");
        int sn = scanner.nextInt();
        System.out.print("이름 -> ");
        String name = scanner.next();

        hash.insert(sn, name);
        hash.search(sn);

        if (hash.delete(sn)) {
            hash.search(sn);
        }
    }
}
