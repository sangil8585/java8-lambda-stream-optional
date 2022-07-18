package stream;

import java.util.Arrays;
import java.util.List;


public class StreamStratWith {

    /**
     * author : byun sangil
     * date : 2022-07-18
     * description :
     **/

    List<String> myList = Arrays.asList("a1","a2","b1","c1","c2");

    myList.stream()
        .filter(s -> s.startsWith("c"))
        .map(String::toUpperCase)
        .sorted()
        .forEach(System.out::println);

}
