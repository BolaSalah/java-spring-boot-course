import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Comparator;

public class StreamExamSolutions {
    public static void main(String[] args) {

//  Question 1: Find the First Non-Repeated Character
//        String input = "swiss";
//        Character FirstNonRepeatedCharacter = input.chars()
//                .mapToObj(c -> (char) c)
//                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
//                .findFirst().orElse(null);
//        System.out.println("First Non-Repeated Character in '" + input + "' is : " + FirstNonRepeatedCharacter);

//  ##################################################################################
//  Question 2: Find Duplicate Elements in a List
//        List<Integer> numbers = Arrays.asList(10, 20, 30, 20, 40, 10, 50, 30);
//        Set<Integer> seen = new HashSet<>();
//        List<Integer> DuplicateElements = numbers.stream().filter(n -> !seen.add(n)).distinct().collect(Collectors.toList());;
//        System.out.println("Duplicate Elements = " + DuplicateElements);

//  ##################################################################################
//  Question 3: Find the Second Highest Number
//        List<Integer> numbers = Arrays.asList(10, 5, 20, 20, 8, 15, 10);
//        Integer SecondHighestNumber = numbers.stream().distinct().sorted(java.util.Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
//        System.out.println("Second Highest Number = " + SecondHighestNumber);

//  ##################################################################################
//  Question 4: Find the Frequency of Each Word
//        String sentence = "Java Spring Java Hibernate Spring Java";
//        Map<String, Long> wordFrequency = Arrays.stream(sentence.split(" "))
//                .map(String::toLowerCase)
//                .collect(Collectors.groupingBy(word -> word,java.util.LinkedHashMap::new, Collectors.counting()));
//        wordFrequency.forEach((word, count) ->
//                System.out.println(word + "=" + count)
//        );

//  ##################################################################################
//  Question 5: Find the Longest String
        List<String> words = Arrays.asList(
                "Java", "SpringBoot", "Microservices",
                "Hibernate", "Docker"
        );
        String theLongestString = words.stream().max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("the Longest String is : " + theLongestString);

    }
}