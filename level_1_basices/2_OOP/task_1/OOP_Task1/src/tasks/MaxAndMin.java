package tasks;

import java.util.Scanner;

class NumberAnalyzer {
    private int a, b, c;

    public NumberAnalyzer(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int findMin() {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public int findMax() {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        NumberAnalyzer analyzer = new NumberAnalyzer(num1, num2, num3);

        System.out.println(analyzer.findMin() + " " + analyzer.findMax());

        scanner.close();
    }
}