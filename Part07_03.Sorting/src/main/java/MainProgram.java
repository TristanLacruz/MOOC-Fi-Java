
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        //Test:
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int i : array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;
        for (int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int aux;
        aux = array[index1];

        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int aux = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, aux);
        }
        
        System.out.println(Arrays.toString(array));
    }
}
