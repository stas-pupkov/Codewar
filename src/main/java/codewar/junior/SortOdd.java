package codewar.junior;

import java.util.*;
import java.util.stream.IntStream;

public class SortOdd {

    public static void main(String[] args) {
        int[] ints = new int[]{ 5, 3, 2, 8, 1, 4 };
        sortArray(ints);
        for (int num: sortArray2(ints)) {
            System.out.println(num);
        }
    }

    public static int[] sortArray(int[] array) {
        List oddNumbers = new ArrayList();
        for (int num: array) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            }
        }
        oddNumbers.sort(Comparator.naturalOrder());
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = (int) oddNumbers.get(j);
                j++;
            }
        }
        return array;
    }

    public static int[] sortArray2(int[] array) {
        int[] oddNumbers = IntStream.of(array)
                .boxed()
                .filter(n -> n % 2 != 0)
                .sorted()
                .mapToInt(i -> i)
                .toArray();

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = oddNumbers[j];
                j++;
            }
        }
        return array;
    }

}
