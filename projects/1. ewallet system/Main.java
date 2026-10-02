import service.impl.ApplicationServiceImpl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome -- Main --");
        new ApplicationServiceImpl().start();
    }
}
