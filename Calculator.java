import java.util.Scanner;

public class Calculator {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Operator = sc.nextInt();

        switch(Operator){
            case 1: System.out.println(a+b + "add");
            break;
            case 2: System.out.println(a-b  + "sub");
            break;
            case 3: System.out.println(a*b + "mul");
            break;
            case 4: if(b==0){
                System.out.println("Invalid divisount");

            }else{
                System.out.println(a/b + "divisin");
            }
               
            
            break;
            case 5: if(b==0){
                System.out.println("Invalid division");
            }else{
                System.out.println(a%b + "Module");
            }
            break;
            default: System.out.println("Invalid operator")


        }

    }
}
