package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {

    public void run() {

        List<String> list = new ArrayList();
        list.add("byun");
        list.add("sang");
        list.add("il");

        list.forEach(x -> System.out.println(x));

    }
}
