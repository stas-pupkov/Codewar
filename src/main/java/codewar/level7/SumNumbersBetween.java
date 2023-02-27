package codewar.level7;

import java.util.stream.IntStream;

public class SumNumbersBetween {

    public static void main(String[] args) {
        System.out.println(getSum(0, -1));
    }

    public static int getSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }

}
