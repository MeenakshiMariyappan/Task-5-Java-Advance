package NonEmptyStringListPrinter;

import java.util.Arrays;
import java.util.List;
 
public class NonEmptyStringListPrinter {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        // Create a new list to store non-empty strings
        List<String> nonEmptyStrings = listStrings.stream()
                                                  .filter(s -> !s.isEmpty())
                                                  .toList();

        System.out.println("List with non-empty strings:");
        System.out.println(nonEmptyStrings);
    }
}