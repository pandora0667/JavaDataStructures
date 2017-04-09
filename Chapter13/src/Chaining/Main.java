package Chaining;

import java.util.Scanner;

/**
 * Created by seongwonlee on 2017. 4. 9..
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap hashMap = new HashMap(10);

        System.out.print("학번 -> ");
        int sn = scanner.nextInt();
        System.out.print("이름 -> ");
        String name = scanner.next();

        hashMap.insert(sn, name);
        System.out.println(hashMap.print(sn));
//        hashMap.delete(sn);
//        System.out.println(hashMap.print(sn));

    }
}
