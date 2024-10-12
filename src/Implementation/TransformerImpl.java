package Implementation;

import Interfaces.Transformer;

public class TransformerImpl {
    public static void main() {
        Transformer toUppercase = String::toUpperCase;
        Transformer toLowercase = String::toLowerCase;
        Transformer reverseString = string -> new StringBuilder(string).reverse().toString();
        Transformer replaceSpaces = string -> string.replace(" ", "-");

        System.out.println("here begins the transformer implementation: ");
        String textToTransform = "La era está pariendo un corazón";

        System.out.println(toLowercase.transform(textToTransform));
        System.out.println(toUppercase.transform(textToTransform));
        System.out.println(reverseString.transform(textToTransform));
        System.out.println(replaceSpaces.transform(textToTransform));

    }
}
