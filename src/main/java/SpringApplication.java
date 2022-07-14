import lambda.LambdaBasic;
import lambda.LambdaForEach;
import optional.OptionalBasic;
import stream.StreamIfPresent;

public class SpringApplication {

    public static void main(String[] args) {

        LambdaBasic lambdaBasic = new LambdaBasic();
        lambdaBasic.run();

        LambdaForEach lambdaForEach = new LambdaForEach();
        lambdaForEach.run();

        OptionalBasic optionalBasic = new OptionalBasic();
        optionalBasic.run();

        StreamIfPresent streamIfPresent = new StreamIfPresent();
        streamIfPresent.run();

    }
}
