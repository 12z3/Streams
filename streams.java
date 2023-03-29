package API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class streams {
    public static void main(String[] args) {

        // Потока може да се използва само един път. До "; скоби". "Затворили" се трябва нов.

        //  Predicate<Integer> pdc = integer -> integer % 2 == 0;
        Predicate<Integer> pdc = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) return true;
                return false;
            }
        };

        Predicate<Integer> pdc1 = integer -> {
            boolean b = integer > 1 && integer < 3;
            return b;
        };

        Predicate<Integer> pdc2 = integer -> integer % 3 == 0;

        List<Integer> l1 = Arrays.asList(33, 1, 2, 4, 5, 6, 7, 8, 9);
        List<Integer> integers = l1.stream()
                .filter(pdc)
                .toList();
        System.out.println(integers);

        List<Double> integers1 = l1.stream()
                .filter(pdc2)
                .map(el -> Double.parseDouble(String.valueOf(el)))
                .toList();
        System.out.println(integers1);
    }

}