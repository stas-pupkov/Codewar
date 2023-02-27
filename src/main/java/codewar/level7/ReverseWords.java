package codewar.level7;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {

    public static void main(String[] args) {
        System.out.println(reverseWords("   "));
    }

    public static String reverseWords(final String original) {
        return original.trim().isEmpty() ? original : Arrays.stream(original.trim().split(" "))
                .map(s -> StringUtils.reverse(s))
                .collect(Collectors.joining(" "));
    }

}
