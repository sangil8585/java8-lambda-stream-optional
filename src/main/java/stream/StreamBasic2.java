package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasic2 {

    public static void main(String[] args){

        /**
         * author : byun sangil
         * date : 2022-07-12
         * description : 람다식 스트림 예제1
         * JAVA7 이전까지는 List<Integer>컬랙션에서 요소를 순차적으로 처리하기 위해 사용해 왔지만,
         * JAVA8 이후부터는 lambda식 Stream을 이용해 처리해야할 코드만 제공하여 코드를 간편하게 했다.
         **/

        //Integer 외부 반복자
        List<Integer> list = (List) Arrays.asList(10,20,30,40,50);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            Integer value = iterator.next();
            System.out.print(value + " ");
        }

        System.out.println("\n===============");

        //Stream 내부 반복자
        List<Integer> list2 = (List) Arrays.asList(10,20,30,40,50);
        Stream<Integer> stream = list2.stream();
        // y = f(x)
        stream.forEach(value -> System.out.print(value+" "));
    }
}
