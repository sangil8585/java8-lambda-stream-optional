package stream;

import java.util.Arrays;
import java.util.List;


public class StreamStartWith {

    public void run() {
        /**
         * author : byun sangil
         * date : 2022-07-18
         * description : stream()을 통해 넘겨받은 객체스트림으로 연산
         * "c"로 시작하는 배열의 수를 걸러낸다.
         * 넘어온 각 원소들의 문자열을 대문자로 넘겨준다.
         * 오름차순 정리
         * forEach문으로 출력
         **/

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c1", "c2");

        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
