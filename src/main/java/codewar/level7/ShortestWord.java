package codewar.level7;

import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWord {

    public static void main(String[] args) {
        System.out.println(findShort2("Let's travel abroad shall we"));
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                .mapToInt(i -> i.length())
                .min()
                .getAsInt();
    }

    public static int findShort2(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }

}
