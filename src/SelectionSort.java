import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 6 ,2 ,7, 8, 11, 19};
        System.out.println(Arrays.toString(array));
        SelectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // N veces
            int min = i; // N - 1 veces
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }
}
