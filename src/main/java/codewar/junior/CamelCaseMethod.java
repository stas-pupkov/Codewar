package codewar.junior;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCaseMethod {

    public static void main(String[] args) {
        System.out.println(camelCase(" as    ds fg     "));
    }

    public static String camelCase(String str) {
        return Arrays.stream(str.split(" "))
                .map(s -> StringUtils.capitalize(s))
                .collect(Collectors.joining());
    }

}
