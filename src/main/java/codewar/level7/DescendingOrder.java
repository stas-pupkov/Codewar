package codewar.level7;

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {
        return Integer.parseInt(
                String.valueOf(num)
                        .chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.joining("")));
    }

    public static int sortDesc2(final int num) {
        return Integer.parseInt(Integer.toString(num).codePoints()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .reverse()
                .toString());
    }

}
