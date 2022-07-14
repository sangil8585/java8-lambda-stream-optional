package stream;

import java.util.stream.Stream;

public class StreamIfPresent {

    public void run() {

        /**
         * author : byun sangil
         * date : 2022-07-14
         * description : 앞의 함수를 처리한 결과 값에 대해 출력함
         **/

        Stream.of("q1", "w2", "e3", "r4")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

    }

}
