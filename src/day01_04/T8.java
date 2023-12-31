package day01_04;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class T8 {
    public static void main(String[] args) {

        String[] strArr = {"dd","aaa","AA","dd"};
        Stream<String> stream = Stream.of(strArr);

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        IntStream intStream = Arrays.stream(arr);
        intStream
                .skip(2)
                .limit(5)
                .forEach(System.out::println);

        stream
                .filter((str) -> str.length() < 3)
                .forEach(System.out::println);

        String[] words = {"hello", "world"};
        Stream<String> streamOfWords = Arrays.stream(words);


    }
}
