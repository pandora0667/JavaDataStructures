package Interpolation;

import java.util.Scanner;

/**
 * Created by seongwonlee on 2017. 3. 27..
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {3, 5, 8, 7, 1, 4, 5, 9};
        InterpolationSearch interpolationSearch = new InterpolationSearch(array);

        System.out.println("찾고자 하는 값을 입력하세요");
        int target = scanner.nextInt();

        int result = interpolationSearch.interpolation(target);

        if (result != -1) {
            System.out.println(result + " 값이 존재합니다.");
        } else {
            System.out.println("값이 존재하지 않습니다.");
        }
    }
}
