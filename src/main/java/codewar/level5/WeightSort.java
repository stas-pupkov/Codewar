package codewar.level5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WeightSort {

    public static void main(String[] args) {
        System.out.println(orderWeight2("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

    public static String orderWeight2(String strng) {
        return Arrays.stream(strng.split(" "))
                .sorted(String::compareTo)
                .sorted(Comparator.comparingInt(c -> c.chars().map(Character::getNumericValue).sum()))
                .collect(Collectors.joining(" "));
    }

}
