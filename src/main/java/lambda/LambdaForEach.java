package lambda;

import java.util.*;

public class LambdaForEach {

    public void run() {
        /**
         * author : byun sangil
         * date : 2022-07-04
         * description : 배열에서 forEach문 사용방법
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

        /**
         * author : byun sangil
         * date : 2022-07-04
         * description : 배열에서 forEach문 사용방법
         * 배열에서 forEach 함수를 사용하기 위해서는 Stream API를 이용해야한다.
         * 배열로 값을 저장해한 arr 변수를 Arrays.stream() 안에 지정해서 forEach 함수로 출력하고 있다.
         *
         */

        String[] arr = { "My", "name", "is", "Byun", "sang", "il" };
        Arrays.stream(arr).forEach(s -> System.out.println(s));


        /**
         * author : byun sangil
         * date : 2022-07-05
         * description : MAP forEach문 사용방법
         * MAP은 KEY와 VALUE값으로 구성되어 있다. forEach를 사용하여 MAP에 들어있는 값을
         * 쉽게 출력할 수 있다.
         */
        Map<String, String> map = new HashMap<>();
        map.put("TONY", "IRON MAN");
        map.put("STEVE", "CAPTAIN AMERICA");
        map.put("THOR", "THOR");
        map.put("BRUCE", "HULK");

        map.forEach((key, value) -> System.out.println(key + " : " + value));
        //
    }

}
