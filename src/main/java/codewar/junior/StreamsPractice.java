package codewar.junior;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {
        streams();
    }

    public static void streams() {
        //Из второй коллекции получить сумму всех чисел, перечисленных через запятую
        List<String> collection2 = Arrays.asList("1,2,0", "4,5", "7,9");
        int sum = collection2.stream()
                .flatMapToInt(p -> Arrays.asList(p.split(",")).stream()
                        .mapToInt(Integer::parseInt))
                .sum();

        //Отсортировать коллекцию строк по алфавиту в обратном порядке
        List<String> collection4 = Arrays.asList("1,2,0", "a,5", "a,9", "0,c", "9,r", "5,t");
        List<String> collect = collection4.stream().sorted((o1, o2) -> -o1.compareTo(o2)).collect(Collectors.toList());
        List<String> collect1 = collection4.stream().sorted(Comparator.comparing(String::valueOf).reversed()).collect(Collectors.toList());

        //Разделить числа на четные и нечетные
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        Map<Boolean, List<Integer>> collect2 = integers.stream().collect(Collectors.partitioningBy((p) -> p % 2 == 0));

        List<String> strings = Arrays.asList("a1", "b2", "c3", "a1");
        //Объединить все элементы в одну строку через разделитель: и обернуть тегами <b>… </b>
        String collect3 = strings.stream().collect(Collectors.joining(": ", "<b> ", " </b>"));
        //Преобразовать в map, где первый символ ключ, второй символ значение
        Map<String, String> collect4 = strings.stream().distinct().collect(Collectors.toMap((p) -> p.substring(0, 1), (p) -> p.substring(1, 2)));
        //Преобразовать в map, сгруппировав по первому символу строки
        List<String> strings2 = Arrays.asList("a1", "b2", "c3", "a1", "b4", "b5", "b6", "c4", "e1");
        Map<String, List<String>> collect5 = strings2.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1)));
        //Преобразовать в map, сгруппировав по первому символу строки и объединим вторые символы через :
        Map<String, String> collect6 = strings2.stream().collect(Collectors.groupingBy((p) -> p.substring(0, 1), Collectors.mapping((p) -> p.substring(1, 2), Collectors.joining(":"))));

        System.out.println(collect5);
    }

    private static List createCollection() {
        Stream.Builder<String> builder = Stream.builder();
        Stream<String> streamFromBuilder = builder.add("a1").add("a2").add("a3").build();
        System.out.println("streamFromBuilder = " + streamFromBuilder.collect((Collectors.toList()))); // напечатает streamFromFiles = [a1, a2, a3]

        // Создание бесконечных стримов
        // С помощью Stream.iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1, n -> n + 2);
        System.out.println("streamFromIterate = " + streamFromIterate.limit(3).collect(Collectors.toList())); // напечатает streamFromIterate = [1, 3, 5]


        // С помощью Stream.generate
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        System.out.println("streamFromGenerate = " + streamFromGenerate.limit(3).collect(Collectors.toList())); // напечатает streamFromGenerate = [a1, a1, a1]




        return new ArrayList();
    }
}
