package codewar.level6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindParityOutlier {

    public static void main(String[] args) {
        System.out.println(find(new int[]{Integer.MAX_VALUE, 0, 1}));
    }

    static int find(int[] integers) {
        List<Integer> arrayList = IntStream.of(integers).boxed().collect(Collectors.toList());
        List<Integer> collectEven = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        List<Integer> collectOdd = arrayList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());

        return collectEven.size() > collectOdd.size() ? collectOdd.get(0) : collectEven.get(0);
    }

    static int find2(int[] integers){
        int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

        return odd.length == 1 ? odd[0] : even[0];
    }

}
