package Weekend.saturday;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.DoubleFunction;
import java.util.stream.IntStream;

public class StringPractice {
    public static void main(String[] args) {

//        int[] array = {1, 2, 3, 4, 5, 6, 7, 0};
//        int xyz = IntStream.of(array).reduce(1, (x, y) -> x * y * 3);
//        System.out.println("Instream reduce method: "+xyz);
//
//
//        int xy = IntStream.rangeClosed(1,10).
//                map(number -> number * 2).
//                sum();
//        System.out.println("X result is: "+xy);
//
//
//        System.out.println("Sum of numbers btw 1-10: "+IntStream.rangeClosed(1,10).map(number -> number * 2).sum());
//
//        System.out.println("Sum of even numbers btw 1-10 * 3: "+IntStream.rangeClosed(1,10).filter(number -> number % 2 == 0).map(number -> number * 3).sum());
//
//
//        //without the filter method
//        System.out.println(IntStream.rangeClosed(1,5).
//                map(x -> x * 2 * 3).
//                sum());
//        SecureRandom random = new SecureRandom();
//
//        System.out.println("Sum of the random is "+IntStream.rangeClosed(1,25).
//                map(number -> random.nextInt(100)).
//                sum());


        Map<Integer, String> integerToString = new HashMap<>();
        integerToString.put(10, "A");
        integerToString.put(11, "B");
        integerToString.put(12, "C");
        integerToString.put(13, "D");
        DoubleFunction<String> mapToString = x -> integerToString.getOrDefault(x, String.valueOf(x));
        System.out.println(mapToString);

    }










    public static void displayInputWord(String sentence) {
        sentence = sentence.toLowerCase(Locale.ROOT);
        Arrays.stream(sentence.split(" ")).distinct().sorted().forEach(System.out::println);
    }
}
