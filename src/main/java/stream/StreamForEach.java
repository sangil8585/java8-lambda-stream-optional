package stream;

import java.util.stream.Stream;

public class StreamForEach {

    public static void main(String[] args) {

        /**
         * author : byun sangil
         * date : 2022-07-13
         * description : 앞의 함수가 처리한 결과 값의 요소가 여러개라면
         * 각 요소에 대해 반복문으로 결과 처리(출력)를 모두 한 후 종료
         **/

        Stream.of("byun", "sangil", "il")
                .map(s -> s.substring(0)) // ["byun", "sang", "il"]
                .forEach(System.out::println); // byun sang il 줄바꿈 출력

    }
}
