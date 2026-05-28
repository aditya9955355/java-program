import java.util.*;
public class EvenOdd {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
