package SortTime;

/**
 * Created by seongwonlee on 2017. 3. 21..
 */
public class Selection {
    private int[] array;

    public Selection(int[] array) {
        this.array = array;
    }

    public void sorting() {
        for (int i=0; i<array.length-1; i++) {
            int max = array[i];
            for (int j=i+1; j<array.length-1; j++) {
                if (array[j] < max) {
                    max = array[j];
                    array[j] = array[i];
                    array[i] = max;
                }
            }
        }
    }
}
