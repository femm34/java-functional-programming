package Implementation;

import Interfaces.UmbralFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UmbralFilterImpl {
    public static void main() {
        List<Integer> listaa = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        UmbralFilter umbralFilter = (x, u) -> x > u;

        Predicate<Integer> yeah = n -> umbralFilter.isValid(n, 5);

        List<Integer> newList = listaa.stream()
                .filter(yeah)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("here begins the UmbralFilterImpl implementation: ");
        System.out.println(newList);
    }
}
