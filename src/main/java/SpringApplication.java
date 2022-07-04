import lambda.LambdaBasic;
import lambda.LambdaForEach;
import lambda.LamdaArrayForEach;
import optional.OptionalBasic;

public class SpringApplication {

    public static void main(String[] args) {

        LambdaBasic lambdaBasic = new LambdaBasic();
        lambdaBasic.run();

        LambdaForEach lambdaForEach = new LambdaForEach();
        lambdaForEach.run();

        OptionalBasic optionalBasic = new OptionalBasic();
        optionalBasic.run();

        LamdaArrayForEach lamdaArrayForEach = new LamdaArrayForEach();
        lamdaArrayForEach.run();

    }
}
