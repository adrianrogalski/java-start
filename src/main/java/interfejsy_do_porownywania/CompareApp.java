package interfejsy_do_porownywania;

import java.util.Arrays;
import java.util.Comparator;

public class CompareApp {

    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 6, 2, 10, 22, 2, 4};
        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -o1.compareTo(o2);
            }
        });

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
