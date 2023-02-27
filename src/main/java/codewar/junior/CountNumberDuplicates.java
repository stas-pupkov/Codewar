package codewar.junior;

import java.util.HashSet;

public class CountNumberDuplicates {

    public static void main(String[] args) {
        System.out.printf("" + duplicateCount("ABBA"));
    }

    public static int duplicateCount(String text) {
        HashSet originalValues = new HashSet();
        HashSet duplicatedValues = new HashSet();
        for (char ch: text.toLowerCase().toCharArray()) {
            if (originalValues.contains(ch)) {
                duplicatedValues.add(ch);
            }
            originalValues.add(ch);
        }
        return duplicatedValues.size();
    }

}
