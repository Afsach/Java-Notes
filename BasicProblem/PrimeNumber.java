import java.util.*;
public class PrimeNumber {

    public static boolean checkPrime(int number){
        int div = 2 ;
        if(number < 2){
            return false;
        }
       while(div < number){
        if(number % div == 0){
            return false;
        }else {
            div+=1;
        }
       }
       return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
       if(checkPrime(number)){
        System.out.println(number + " Is a prime number ");
       }else {
        System.out.println(number + " Is not a prime number ");
       }
    }
}