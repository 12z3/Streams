package API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorM {
    public static void main(String[] args) {

        // compare(String o1, String o2) -> ТРЯБВА да върне 1, -1 или 0; Сравнява елементите за подредба.
        // sort(input,cmp) - > as, bah, asd, skajlksaj, alskjlksj
        // sort(input) - > alskjlksj, as, asd, bah, skajlksaj

        List<String> input = new ArrayList<>(List.of("bah", "skajlksaj", "as", "alskjlksj", "asd"));
//        Comparator<String> cmp = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) return 1;
//                return -1;
//            }
//        };
        Comparator<String> cmp = (o1, o2) -> {
            return (o1.length() > o2.length()) ? 1 : -1;
        };

        Collections.sort(input,cmp);
        System.out.println(input);

        List<String> strings = input.stream()
                .sorted(cmp)
                .toList();

        System.out.println(strings);
        strings.forEach(el -> System.out.print(el + " "));
       // strings.forEach(System.out::println);
    }
}
