package codewar.level6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {

    public static void main(String[] args) {
        System.out.println(pigIt2("Pig latin s cool !"));
    }

    public static String pigIt(String str) {
        String spCh = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
        return Arrays.stream(str.split(" "))
                .map(s -> (s.length() == 1 && spCh.contains(s)) ? s : (s.substring(1) + s.substring(0, 1) + "ay"))
                .collect(Collectors.joining(" "));
    }

    public static String pigIt2(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

}
