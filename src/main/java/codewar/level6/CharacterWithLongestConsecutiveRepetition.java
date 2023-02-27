package codewar.level6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CharacterWithLongestConsecutiveRepetition {

    public static void main(String[] args) {
        longestRepetition("aaaabb");
    }

    public static Object[] longestRepetition(String s) {
        if (s.length() == 0) return new Object[]{"", 0};
        List<String> uniqueValues = s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.toList());
        List<Integer> numberRepetitions = IntStream.range(0, uniqueValues.size())
                .mapToObj(i -> (int) s.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .filter(w -> w.equals(uniqueValues.get(i)))
                        .count())
                .collect(Collectors.toList());

        int maxNumber = numberRepetitions.stream().max(Integer::compareTo).get();
        String maxValue = uniqueValues.get(numberRepetitions.indexOf(maxNumber));

        System.out.println(maxValue + "  " + maxNumber);

        return new Object[]{maxValue, maxNumber};
    }

}
