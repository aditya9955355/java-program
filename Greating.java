import java.util.Scanner;

public class Greating {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Nameste");
            break;
            case 3: System.out.println("Bonjor");
            break;
            default: System.out.println("Invalid");

        }
    }
}
