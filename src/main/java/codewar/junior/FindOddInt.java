package codewar.junior;

import java.util.HashMap;

import static java.util.Arrays.stream;

public class FindOddInt {

    public static void main(String[] args) {
        int[] ints = {1,1,2,-2,5,2,4,4,-1,-2,5};
        System.out.println(findIt3(ints));
    }

    public static int findIt(int[] a) {
        HashMap<Integer, Boolean> map = new HashMap();
        for (int num : a) {
            if (map.containsKey(num)) {
                map.put(num, !map.get(num));
            }
            map.putIfAbsent(num, true);
        }
        return map.entrySet().stream()
                .filter(value -> value.getValue().equals(true))
                .findFirst().get().getKey();
    }

    public static int findIt2(int[] arr) {
        return stream(arr).reduce(0, (x, y) -> x ^ y);
    }

    public static int findIt3(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

}
