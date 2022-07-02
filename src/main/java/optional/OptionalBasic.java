package optional;

import java.util.Optional;

public class OptionalBasic {

    public void run() {

        /**
         * author : byun sangil
         * date : 2022-07-02
         * description : Optional 함수를 통해서 optional 객체 값이 null인지 확인한다.
         * 첫 번째 결과 값은 Optional.empty, 두 번째 결과 값은 false가 반환된다.
            1. System.out.println(optional);
            2. System.out.println(optional.isPresent());
         **/
        Optional<String> optional = Optional.empty();

        System.out.println(optional);
        System.out.println(optional.isPresent());

    }
}
