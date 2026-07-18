package tasks;

import java.util.Scanner;

class HardCompareTask {
    private long a;
    private long b;
    private long c;
    private long d;
    
    public HardCompareTask(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public String compare() {
        double firstSide = b * Math.log(a);
        
        double secondSide = d * Math.log(c);
        
        if (firstSide > secondSide) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

public class HardCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long num1 = scanner.nextLong();
        long num2 = scanner.nextLong();
        long num3 = scanner.nextLong();
        long num4 = scanner.nextLong();
        
        HardCompareTask task = new HardCompareTask(num1, num2, num3, num4);
        System.out.println(task.compare());
        
        scanner.close();
    }
}