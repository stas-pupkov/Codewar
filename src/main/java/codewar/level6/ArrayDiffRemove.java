package codewar.level6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDiffRemove {

    public static void main(String[] args) {
        Arrays.stream(arrayDiff(new int[]{1, 2}, new int[]{1})).forEach(System.out::println);
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> arrayListA = IntStream.of(a).boxed().collect(Collectors.toList());
        List<Integer> arrayListB = IntStream.of(b).boxed().collect(Collectors.toList());

        return arrayListA.stream()
                .filter(i -> !arrayListB.contains(i))
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    public static int[] arrayDiff2(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }

}
