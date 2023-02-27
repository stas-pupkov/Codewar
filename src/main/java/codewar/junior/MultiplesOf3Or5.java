package codewar.junior;

import java.util.stream.IntStream;

public class MultiplesOf3Or5 {

    public static void main(String[] args) {
        System.out.printf("" + solution2(10));
    }

    public static int solution(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i%3 == 0 || i%5 == 0 || (i%3 == 0 && i%5 == 0)) {
                sum+=i;
            }
        }
        return sum;
    }

    public static int solution2(int number) {
        return IntStream
                .range(3, number)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}
