import java.util.*;
public class PrintPrimeTillN {

    public static boolean checkPrime(int number){
        int div = 2;
        while(number > div) {
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
        System.out.println("Enter a number");
        int number = sc.nextInt();
        System.out.println("list of prime numbers till " + number);
        for(int i=2; i<number; i++){
           if(checkPrime(i)){
            System.out.println(i);
           }
        }
    }
}