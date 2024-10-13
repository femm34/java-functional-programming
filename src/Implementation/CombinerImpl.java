package Implementation;

import Interfaces.Combiner;

public class CombinerImpl {
    public static void main() {
        Combiner combiners = (firstWord, secondWord) -> firstWord + "      " + secondWord;

        String newString = combiners.combine("Hello", "world!");

        System.out.println("here begins the CombinerImpl implementation: ");
        System.out.println(newString);

    }
}
