package tasks;

import java.util.Scanner;

class Greeter {

    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + this.name);
    }
}

public class SayHell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputName = scanner.next();
        
        Greeter greeter = new Greeter(inputName);
        
        greeter.sayHello();
        
        scanner.close();
    }
}