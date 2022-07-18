package stream;

import java.util.Arrays;
import java.util.List;

public class StreamFindFirst {

    public void run(){

        /**
         * author : byun sangil
         * date : 2022-07-19
         * description : stream()을 통해 넘겨받은 객체 스트림을 사용해보기
         * findFirst가 넘겨준 배열의 첫 번째 수를 받는다.
         * ifPresent로 넘어온 수가 있다면 출력
         **/

        List<String> myList = Arrays.asList("a1","a2","a3");

        myList.stream()
                .findFirst()
                .ifPresent(System.out::println);

    }
}
