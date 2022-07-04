package lambda;


import java.util.Arrays;

public class LamdaArrayForEach {

    public void run() {
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

        }

    }

