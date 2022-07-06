package stream;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamBasic {

    public void run() {
        /**
         * author : byun sangil
         * date : 2022-07-07
         * description : Stream은 자바8에서 추가된 기능으로 함수형 인터페이스인 lambda를 활용할 수 있는 기술이다.
         * Stream이 나오기 이전에는 배열이나 컬렉션을 이용해 섞어 작성했지만, Stream과 람다를 이용해 코드의 양을
         * 대폭 줄이고 간결하게 작성 할 수 있게 되었다.
         * 또한 스트림을 사용하면 멀티 스레드 환경에 필요한 코드를 작성하지 않아도 데이터를 병렬로 처리할 수 있다.
         **/

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("byun", "sang", "il"));
        list.stream()
                .filter("b"::equals)
                .forEach(System.out::println);

    }
}
