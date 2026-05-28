import java.util.*;
public class CallGuest {
    public static int callGuests(int n){
        if(n <= 1){
            return 1;
        }
        int ways1 = callGuests(n-1);
        int ways2 = (n-1) * callGuests(n-2);
        return ways1 + ways2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(callGuests(n));
        
    }
}
