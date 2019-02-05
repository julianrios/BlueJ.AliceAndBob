import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {
 private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args ){
        System.out.println("Hello please enter your name.");
        String name = scanner.nextLine();
        if(name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Hello " + name + "!"); 
        } else {
            System.out.println(name + " you are not Alice or Bob please go away.");
        }
    }
}
