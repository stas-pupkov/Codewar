package codewar.level6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueNumber {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    public static double findUniq(double arr[]) {
        List<Double> first3Values = Arrays.stream(arr).boxed().limit(3).collect(Collectors.toList());
        List<Double> uniqueValues = Arrays.stream(arr).boxed().distinct().collect(Collectors.toList());
        boolean b = first3Values.indexOf(uniqueValues.get(0)) == first3Values.lastIndexOf(uniqueValues.get(0));
        return b ? uniqueValues.get(0) : uniqueValues.get(1);
    }

}
