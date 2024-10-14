package Implementation;

import Interfaces.Combiner;

public class CombinerImpl {
    public static void main() {
        Combiner combiners = (firstWord, secondWord) -> firstWord + "      " + secondWord;
        Combiner combinersInterface = CombinerImpl::mergeWords;

        System.out.println("here begins the CombinerImpl implementation: ");
        System.out.println(combinersInterface.combine("Hello", "world!"));

    }

    private static String mergeWords(String firstWord, String secondWord) {
        return firstWord + "      " + secondWord;
    }
}
