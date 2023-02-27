package codewar.level7;

import org.apache.commons.lang3.StringUtils;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mumbling {

    public static void main(String[] args) {
        System.out.println(accum3("ZpglnRxqenU"));
        System.out.println("Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu".equals(accum3("ZpglnRxqenU")));
    }

    //Correct way to represent String stream
    public static String accum(String s) {
        String workWord = s.toLowerCase();
        AtomicInteger counter = new AtomicInteger(1);
        return workWord.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(m -> StringUtils.repeat(m, counter.get()))
                .map(l -> StringUtils.capitalize(l))
                .peek(x -> counter.getAndIncrement())
                .collect(Collectors.joining("-"));
    }

    public static String accum3(String s) {
        String workWord = s.toLowerCase();
        return IntStream.range(0, workWord.length())
                .mapToObj(i -> StringUtils.repeat(workWord.charAt(i), i + 1))
                .map(l -> StringUtils.capitalize(l))
                .collect(Collectors.joining("-"));

    }

}
