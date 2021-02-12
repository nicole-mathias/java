// we reverse the given number and compare
//the users number and reversed number
// if both are same, then it is a palindrome number
// else not a palindrome
// examples of palidrome => 121, 12321, nitin

public class PalindromeNumbers {
    public static void isPalindrome(int number){
        int num = number;
        int reversedNum = 0;
       
        while(number != 0){
            int lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10;
        }
        
        if(reversedNum == num){
            System.out.println("Yes");
        }else{
            System.out.println("No");

          
        }
        
    }
    
    
    public static void main(String args[]) {
        isPalindrome(12321);
        isPalindrome(12341);
        
    }

}
