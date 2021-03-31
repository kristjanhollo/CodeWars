package ReverseLetter;

/**
 * Given a string str, reverse it omitting all non-alphabetic characters.
 *
 * Example
 * For str = "krishan", the output should be "nahsirk".
 *
 * For str = "ultr53o?n", the output should be "nortlu".
 *
 * Input/Output
 * [input] string str
 *
 * A string consists of lowercase latin letters, digits and symbols.
 *
 * [output] a string
 */
public class Main {

    public static void main(String[] args) {
        System.out.println(reverseLetter("hell91284 ffdj0qe.-wgwguw"));
    }
    public static String reverseLetter(final String str) {
        String nonFinalStr = str;
        nonFinalStr = str.replaceAll("[^a-zA-Z]", "");
        String sentence = new StringBuilder().append(nonFinalStr).reverse().toString();

        return sentence; //coding and coding..
    }
}
