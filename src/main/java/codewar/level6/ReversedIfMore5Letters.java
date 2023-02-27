package codewar.level6;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversedIfMore5Letters {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
    }

    public static String spinWords(String sentence) {
        return Arrays.stream(sentence.split(" "))
                .map(s -> s.length() > 4 ? StringUtils.reverse(s) : s)
                .collect(Collectors.joining(" "));
    }

}
