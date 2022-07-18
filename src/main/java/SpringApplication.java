import lambda.LambdaBasic;
import lambda.LambdaForEach;
import optional.OptionalBasic;
import stream.StreamAnyMatch;
import stream.StreamFindFirst;
import stream.StreamIfPresent;
import stream.StreamStartWith;


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

        StreamAnyMatch streamAnyMatch = new StreamAnyMatch();
        streamAnyMatch.run();

        StreamStartWith streamStartWith = new StreamStartWith();
        streamStartWith.run();

        StreamFindFirst streamFindFirst = new StreamFindFirst();
        streamFindFirst.run();
    }
}
