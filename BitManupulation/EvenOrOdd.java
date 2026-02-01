package BitManupulation;
import java.util.*;
public class EvenOrOdd {
    public static void evenOrOdd(int n){
        int bitMask =1;
        if((n & bitMask) == 0){
            System.out.println("n is Even");
        }
        else{
            System.out.println("n is Odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr n:");
        int n = sc.nextInt();
        evenOrOdd(n);
    }
    
}
