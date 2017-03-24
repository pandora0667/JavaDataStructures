package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 22..
 */
public class Main {
    public static void main(String[] args) {
        ProgressBar bar = new ProgressBar();

        System.out.println("\t\t ---------- Sorting Time Measurement -----------");

        System.out.println("1. Bubble sorting");
        System.out.println("2. Selection sorting");
        System.out.println("3. Insertion sorting");
        System.out.println("4. Heap sorting");
        System.out.println("5. Merge sorting");
        System.out.println("6. Quick sorting");
        System.out.println("7. Radix sorting");

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Creating Random Array list.... Please Wait...");
        SortingInit sortingInit = new SortingInit(10000);
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.ArrayCreating();
            bar.update(i, 1000);
        }
        System.out.println("Create Complete Random Array List!!");
        System.out.println();

        System.out.println("Start - Bubble Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.bubbleSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Bubble Sorting - < " + sortingInit.getTime() + " >");
        System.out.println();

        System.out.println("Start - Selection Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.selectionSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Selection Sorting - < " + sortingInit.getTime() + " >");
        System.out.println();

        System.out.println("Start - Insertion Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.insertionSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Insertion Sorting - < " + sortingInit.getTime() + " >");
        System.out.println();

        System.out.println("Start - Heap Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.heapSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Heap Sorting - < " + sortingInit.getTime() + " >");
        System.out.println();


        System.out.println("Start - Merge Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.mergeSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Merge Sorting - < " + sortingInit.getTime() + " ms >");
        System.out.println();


        System.out.println("Start - Quick Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.quickSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Quick Sorting - < " + sortingInit.getTime() + " >");
        System.out.println();


        System.out.println("Start - Radix Sorting - ");
        bar.update(0, 1000);
        for (int i = 0; i < 1000; i++) {
            sortingInit.setTime(sortingInit.radixSortingTime());
            bar.update(i, 1000);
        }
        System.out.println("Result - Radix Sorting - < " + sortingInit.getTime() + " >");
        System.out.println();
    }
}
