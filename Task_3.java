import java.util.ArrayList;
import java.util.Arrays;

/**
 * Реализовать алгоритм сортировки пузырьком
 */

public class Task_3 {
    public static void main(String[] args) {
        int[] array = { 15, 50, 74, 88, 91, 66, 36, 88, 23, 13 };
        int tempVar;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j + 1]) {
                    tempVar = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tempVar;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
