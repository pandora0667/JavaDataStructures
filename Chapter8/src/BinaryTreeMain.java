import java.util.Scanner;

/**
 * Created by seongwonlee on 2017. 3. 12..
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(6);
        binarySearchTree.insert(5);
        binarySearchTree.insert(4);
        binarySearchTree.insert(10);
        binarySearchTree.insert(8);
        binarySearchTree.insert(9);
        binarySearchTree.insert(7);

        System.out.print("데이터 확인 => ");
        binarySearchTree.print();

        System.out.println();
        System.out.print("검색할 번호를 입력하세요 : ");
        int data = scanner.nextInt();
        TreeNode search = binarySearchTree.search(data);

        if (search != null) {
            System.out.println(search.data + " 탐색 성공");
        } else {
            System.out.println("탐색 실패");
        }
    }
}
