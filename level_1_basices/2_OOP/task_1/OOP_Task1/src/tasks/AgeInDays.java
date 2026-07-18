package tasks;

import java.util.Scanner;

class AgeInDaysTask {
    private int numOfDays;
    
    public AgeInDaysTask(int numOfDays) {
        this.numOfDays = numOfDays;
    }
    
    public String calculateAge() {
      int years = numOfDays / 365 ;
      int reminder = numOfDays % 365;
      int months = reminder / 30 ;
      int days = reminder % 30 ;
      
        return (years + " years\n" + months + " months\n" + days + " days");
    }
}

public class AgeInDays {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        
        AgeInDaysTask calc = new AgeInDaysTask(num);
        System.out.println(calc.calculateAge());

        scanner.close();
    }
}