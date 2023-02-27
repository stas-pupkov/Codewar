package codewar.junior;

import java.util.Arrays;

public class HighAndLow {

    public static void main(String[] args) {
        System.out.printf(highAndLow("8 3 -53 42 -1 100 0 -9 4 7 4 -4"));
    }

    public static String highAndLow(String numbers) {
        int max = Arrays.stream(numbers.split(" ")).map(Integer::valueOf).max(Integer::compare).get();
        int min = Arrays.stream(numbers.split(" ")).map(Integer::valueOf).min(Integer::compare).get();
        return "" + max + " " + min;
    }
}
