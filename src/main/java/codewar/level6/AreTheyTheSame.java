package codewar.level6;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class AreTheyTheSame {

    public static void main(String[] args) {
        int[] a = new int[]{122, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) return false;
        Set<Double> collectA = Arrays.stream(a).boxed().map(Double::valueOf).collect(Collectors.toSet());
        Set<Double> collectB = Arrays.stream(b).boxed().map(Math::sqrt).collect(Collectors.toSet());
        return collectB.stream()
                .map(d -> collectA.contains(d) ? 1 : 0)
                .filter(i -> i == 0)
                .count() <= 0;
    }

}
