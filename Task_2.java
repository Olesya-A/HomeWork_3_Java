import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
Создать список целых чисел (заполнить случайными числами).
Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Random random = new Random(100);
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.printf("Minimum is %s\n.", list.get(0));
        System.out.printf("Maximum is %s\n.", list.get(list.size()-1));
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.printf("Average is %s\n.", sum/ list.size());
    }
}
