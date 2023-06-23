import java.util.*;
public class Fibonacci {

    public static void printFibb(int n){
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i<n; i++){
           int next = a + b;
           System.out.print(next + " ");
           a = b;
           b = next;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printFibb(n);
    }
}