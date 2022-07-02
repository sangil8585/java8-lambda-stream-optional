package lambda;

import lambda.entity.Formula;

public class LambdaBasic {

    public void run() {

        /**
         * author : byun sangil
         * date : 2022-07-01
         * description : Java 8에서 새로 등장한 Lambda는 표현이 비교적 자유롭기 때문에 아래 두 방식을 모두 사용할 수 있다.
            1. Formula formula = (a, b) -> a + b;
            2. Formula formula = (a, b) -> Integer.sum(a, b);
         **/
        // 메소드 참조
        Formula formula = Integer::sum;
        System.out.println(formula.sum(10, 11));

    }
}

