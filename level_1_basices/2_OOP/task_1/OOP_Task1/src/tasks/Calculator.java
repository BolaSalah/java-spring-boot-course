package tasks;

import java.util.Scanner;

class CalculatorTask {
    private int firstNum;
    private int secondNum;
    private char operator;
    
    public CalculatorTask(int firstNum, char operator, int secondNum) {
        this.firstNum = firstNum;
        this.operator = operator;
        this.secondNum = secondNum;
    }
    
    public int calculate() {
        switch (operator) {
            case '+':
                return firstNum + secondNum;
            case '-':
                return firstNum - secondNum;
            case '*':
                return firstNum * secondNum;
            case '/':
                return firstNum / secondNum;
            default:
                return 0; 
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        char op = scanner.next().charAt(0);
        int num2 = scanner.nextInt();
        
        CalculatorTask calc = new CalculatorTask(num1, op, num2);
        System.out.println(calc.calculate());

        scanner.close();
    }
}