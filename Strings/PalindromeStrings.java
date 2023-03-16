import java.util.*;

public class PalindromeStrings {

    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++ ){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check for palindrome strings");
        System.out.println("enter a string :");
       String s1= sc.nextLine();
        
        if(checkPalindrome(s1)){
            System.out.println(s1 + " is a palindrome string");
        }else{
             System.out.println(s1 + " is not a palindrome string");
        }
    }
}