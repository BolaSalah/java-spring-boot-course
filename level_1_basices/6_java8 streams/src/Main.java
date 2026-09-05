import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.Collections;

public class Main {

    // Global Variables
    private static final List<Integer> NUMBERS = Arrays.asList(10, 5, 3, 7, 2, 10, 5, 8, 9, 0, -3, 4);
    private static final List<String> NAMES = Arrays.asList("Ali", "Mona", "Ahmed", "Sara", "Amr", "Laila", "Kareem", "Nada", "Nour", "Samy", "", null);

    public static void main(String[] args) {

//       Basic Stream Operations
//        task1(); //evens
//        task2(); //namesStartWithA
//        task3(); //uppercaseNames
//        task4(); //sortedDesc
//        task5(); //uniqueNumbers

//----------------------------------------------------------------------

//      Intermediate Stream Tasks
//        task6(); //count
//        task7(); //firstELement
//        task8(); //hasDivisibleBy5
//        task9(); //uniqueNumbersSet
//        task10(); //skippedNumbers

//----------------------------------------------------------------------

//      Numeric Streams & Reductions
//        task11(); //sumNumbers
//        task12(); //minMaxList

//----------------------------------------------------------------------

//        Advanced Operations
//        task13(); //secondMax
//        task14(); //duplicates
//        task15(); //cleanedList
    }

//----------------------------------------------------------------------
//    Basic Stream Operations

    private static void task1() {
        List<Integer> evens = NUMBERS.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Task 1 => evens : " + evens);
    }

    private static void task2() {
        List<String> namesStartWithA = NAMES.stream().filter(name -> name != null && name.startsWith("A")).toList();
        System.out.println("Task 2 => namesStartWithA : " + namesStartWithA);
    }

    private static void task3() {
        List<String> uppercaseNames = NAMES.stream().filter(name -> name != null && !name.isEmpty()).map(name -> name.toUpperCase()).toList();
        System.out.println("Task 3 => uppercaseNames : " + uppercaseNames);
    }

    private static void task4() {
        List<Integer> sortedDesc = NUMBERS.stream().sorted((a, b) -> b.compareTo(a)).toList();
        // another way to solution with build in method => reverse()
        // List<Integer> sortedDesc = numbers.stream().sorted().toList().reversed();
        System.out.println("Task 4 => sortedDesc : " + sortedDesc);
    }

    private static void task5() {
        List<Integer> uniqueNumbers = NUMBERS.stream().distinct().toList();
        System.out.println("Task 5 => uniqueNumbers : " + uniqueNumbers);
    }

//----------------------------------------------------------------------
//      Intermediate Stream Tasks

    private static void task6() {
        long count = NAMES.stream().filter(name -> name != null && name.length() > 5).count();
        System.out.println("Task 6 => count : " + count);
    }

    private static void task7() {
            String firstELement = NAMES.stream().filter(name -> name != null && name.endsWith("a")).findFirst().orElse("Not Found");
        System.out.println("Task 7 => firstELement : " + firstELement);
    }

    private static void task8() {
        boolean hasDivisibleBy5 = NUMBERS.stream().anyMatch(num -> num%5 == 0 );
        System.out.println("Task 8 => hasDivisibleBy5 : " + hasDivisibleBy5);
    }

    private static void task9() {
        Set<Integer> uniqueNumbersSet = NUMBERS.stream().collect(Collectors.toSet());
        System.out.println("Task 9 => uniqueNumbersSet : " + uniqueNumbersSet);
    }

    private static void task10() {
        List<Integer> skippedNumbers = NUMBERS.stream().skip(3).toList();
        System.out.println("Task 10 => skippedNumbers : " + skippedNumbers);
    }

//----------------------------------------------------------------------
//      Numeric Streams & Reductions

    private static void task11() {
        int sumNumbers = NUMBERS.stream().reduce(0,(a,b)->a+b);
        System.out.println("Task 11 => sumNumbers : " + sumNumbers);
    }

    private static void task12() {
        int maxNum = NUMBERS.stream().max((a,b) -> a.compareTo(b)).orElse(0);
        int minNum = NUMBERS.stream().min((a,b) -> a.compareTo(b)).orElse(0);
        List<Integer> minMaxList = List.of(maxNum, minNum);
        System.out.println("Task 12 => minMaxList : " + minMaxList);
    }

//----------------------------------------------------------------------
//        Advanced Operations

    private static void task13() {
        int secondMax = NUMBERS.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);;
        System.out.println("Task 13 => secondMax : " + secondMax);
    }

    private static void task14() {
        List<Integer> duplicates = NUMBERS.stream().filter(n -> Collections.frequency(NUMBERS, n) > 1).distinct().toList();
        System.out.println("Task 14 => duplicates : " + duplicates);
    }

    private static void task15() {
        List<String> cleanedList = NAMES.stream().filter(name ->name!=null && !name.trim().isEmpty()).toList();
        System.out.println("Task 15 => cleanedList : " + cleanedList);
    }

}