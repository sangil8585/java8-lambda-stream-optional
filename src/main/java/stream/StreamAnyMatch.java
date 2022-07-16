package stream;

import java.util.stream.Stream;

public class StreamAnyMatch {

    public void run(){

        /**
         * author : byun sangil
         * date : 2022-07-16
         * description : 앞의 함수를 처리한 결과 값에 대해 출력함
         **/

        Stream.of("d2","a2","b1","b3","c")
                .map( s -> {
                    System.out.println("map : " + s);
                    return s.toUpperCase();
                })
                .anyMatch( s -> {
                    System.out.println("anyMatch : " + s);
                    return s.startsWith("A");
                });
    }
}
