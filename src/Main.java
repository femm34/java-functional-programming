import Implementation.CalculatorImpl;
import Implementation.CombinerImpl;
import Implementation.TransformerImpl;
import Implementation.UmbralFilterImpl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numeros = Arrays.asList(1, 3, 4, 5, 5, 6, 4, 8, 4, 2, 0);
//        EsPar esPar = numero -> numero % 2 == 0;
//        Predicate<Integer> esImpar = numero -> numero % 2 != 0;
//        var sumaImpares = numeros.stream()
//                .filter(esImpar)
//                .mapToInt(Integer::intValue)
//                .sum();
//        System.out.println(sumaImpares);
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        TransformerImpl.main();
        System.out.println("--------------------------");
        CalculatorImpl.main();
        System.out.println("--------------------------");
        UmbralFilterImpl.main();
        System.out.println("--------------------------");
        CombinerImpl.main();
    }
}