package tasks;

import java.util.Scanner;

class intersection {
    private int num_a_1;
    private int num_a_2;
    private int num_b_1;
    private int num_b_2;
    
    public intersection(int num_a_1, int num_a_2, int num_b_1 , int num_b_2) {
        this.num_a_1 = num_a_1;
        this.num_a_2 = num_a_2;
        this.num_b_1 = num_b_1;
        this.num_b_2 = num_b_2;
    }
    
    public String intersectionNumbers() {
        int min = 0; // The largest starting boundary (max of starts)
        int max = 0; // The smallest ending boundary (min of ends)
        
      if (num_a_1 < num_b_1){
          min = num_b_1 ;
      } else {
          min = num_a_1 ;
      }
      if (num_a_2 < num_b_2){
          max = num_a_2 ;
      } else {
          max = num_b_2 ;
      }
      
      if (min <= max) {
          return min + " " + max;
      } else {
          return "-1";
      }
    }
}

public class TwoIntervals {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();
        int num_4 = scanner.nextInt();

        intersection intersec = new intersection(num_1, num_2, num_3, num_4);
        System.out.println(intersec.intersectionNumbers());

        scanner.close();
    }
}