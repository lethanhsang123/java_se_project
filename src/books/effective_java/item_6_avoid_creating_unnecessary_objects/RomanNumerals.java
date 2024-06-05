package books.effective_java.item_6_avoid_creating_unnecessary_objects;

import java.util.regex.Pattern;

/**
 * String.matches is the easiest way to check if a string matches a regular expression,
 * it's not suitable for repeated use in performance-critical situations
 *
 */

public class RomanNumerals {
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
