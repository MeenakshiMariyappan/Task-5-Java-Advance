package StringToUpper;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class StringToUpper {
    public static void main(String[] args) {
    	//Create a stream of strings
        Stream<String> names = Stream.of("aBc", "d", "ef");
        //Map each string to its uppercase equivalent
        List<String> upperNames = names.map(String::toUpperCase)
                                       .collect(Collectors.toList());
        System.out.println(upperNames);
    }
}