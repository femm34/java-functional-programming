package Implementation;

import Interfaces.Transformer;

public class TransformerImpl {
    public static void main() {
        Transformer toUppercase = String::toUpperCase;
        Transformer toLowercase = String::toLowerCase;
        Transformer reverseString = TransformerImpl::reverse;
        Transformer replaceSpaces = TransformerImpl::replaceSpaces;

        System.out.println("here begins the transformer implementation: ");
        String textToTransform = "La era está pariendo un corazón";

        System.out.println(toLowercase.transform(textToTransform));
        System.out.println(toUppercase.transform(textToTransform));
        System.out.println(reverseString.transform(textToTransform));
        System.out.println(replaceSpaces.transform(textToTransform));

    }

    private static String reverse(String string) {
        return new StringBuilder(string).reverse().toString(); // i use this instead lambda
    }

    private static String replaceSpaces(String input){
        return input.replaceAll(" ", "-");  // i use this instead lambda
    }
}
