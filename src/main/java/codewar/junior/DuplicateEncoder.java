package codewar.junior;

import java.util.HashMap;
import java.util.stream.Collectors;

public class DuplicateEncoder {

    public static void main(String[] args) {
        System.out.println(encode2("   ()(   "));
    }

    static String encode(String word){
        HashMap<Character, Character> map = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();

        for (char ch: word.toLowerCase().toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, ')');
            } else {
                map.put(ch, '(');
            }
        }
        for (char ch: word.toLowerCase().toCharArray()) {
            stringBuilder.append(map.get(ch));
        }
        return String.valueOf(stringBuilder);
    }

    static String encode2(String word) {
        String workWord = word.toLowerCase();
        return workWord.chars()
                .mapToObj(i -> String.valueOf((char) i))
                .map(i -> workWord.indexOf(i) == workWord.lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }

}
