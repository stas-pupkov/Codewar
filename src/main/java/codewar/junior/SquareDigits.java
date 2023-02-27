package codewar.junior;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SquareDigits {

    public static void main(String[] args) {
        squareDigits(0);
    }

    public static int squareDigits(int n) {
        if (n == 0) return 0;

        ArrayList<Integer> order = new ArrayList<>();
        while (n > 0) {
            int last = n % 10;
            order.add(last*last);
            n = n / 10;
        }
        String number = "";
        for (int i = order.size() - 1; i >= 0; i--) {
            number = number + order.get(i);
        }
        return Integer.parseInt(number);
    }

    public static int squareDigits2(int n) {
        return Integer.parseInt(
                String.valueOf(n)
                        .chars()
                        .map(x -> Character.getNumericValue((char) x))
                        .map(x -> x * x)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(""))
        );
    }

}
