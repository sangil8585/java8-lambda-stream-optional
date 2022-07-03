package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

    public void run() {
        /**
         * author : byun sangil
         * date : 2022-07-03
         * description : collection.forEach(변수 -> 반복처리(변수))
         * collection에는 배열, 리스트 등의 데이터를 저장하는 변수명을 지정합니다.
         * forEach 함수는 람다식을 작성해야 하지만, 간단한 반복 처리같은 경우에는 쉽게 이해가 가능하다.
         *
         * for문과 forEach문에서 출력한 결과 값은 같다.
         * forEach문은 람다식으로 표현하기 때문에 소스도 간결하게 작성할 수 있다.
         */
        List<String> list = new ArrayList();
        list.add("byun");
        list.add("sang");
        list.add("il");

        System.out.println("확장 for문 출력");
        for(String str : list) {
            System.out.println(str);
        }

        System.out.println("forEach문 함수 출력");
        list.forEach(x -> System.out.println(x));

    }
}
