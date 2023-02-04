import java.util.ArrayList;
import java.util.Random;

/**
 * Создать список целых чисел (заполнить случайными числами), удалить из списка
 * четные числа.
 */
public class Task_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }

}