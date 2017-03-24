package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Bubble {
    private int[] array;

    public Bubble(int[] array) {
        this.array = array;
    }

    public void sorting() {
        for (int i=0; i<array.length-1; i++) {
            for (int j=0; j<array.length-i-1; j++) {
                if (array[j+1] < array[j]) {
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
