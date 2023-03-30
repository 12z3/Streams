package API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsM {
    public static void main(String[] args) {

        // Потока може да се използва само един път. До "; скоби". "Затворили" се трябва нов.

        //  Predicate<Integer> pdc = integer -> integer % 2 == 0;
        Predicate<Integer> pdc = new Predicate<>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Predicate<Integer> pdc1 = integer -> {
            boolean b = integer > 1 && integer < 3;
            return b;
        };

        Predicate<Integer> pdc2 = integer -> integer % 3 == 0;

        // Забележи, ча типа на "integers" съвпада с типа на "toList() -> List<Integer>", който е затварящ потока;
        List<Integer> l1 = Arrays.asList(33, 1, 2, 4, 5, 6, 7, 8, 9);
        List<Integer> integers = l1.stream()
                .filter(pdc)
                .toList();
        System.out.println(integers);

        List<Double> integers1 = l1.stream()
                .filter(pdc2) // създава нов поток върху който прилага предиката на филтъра
                .map(el -> Double.parseDouble(String.valueOf(el))) // създава нов поток от стария
                .toList(); // затваря потока като крайния резултат е от тип List<Double>
        System.out.println(integers1);
    }

}