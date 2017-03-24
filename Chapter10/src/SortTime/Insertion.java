package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Insertion {
    private int[] array;

    public Insertion(int[] array) {
        this.array = array;
    }

    public void sorting() {
        for (int i=1; i<array.length; i++) {
            int insData = array[i];

            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > insData) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
        }
    }
}
