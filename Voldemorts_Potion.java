// Harry wants to find Voldemort's potion making book but he is confused about how to get it.

// The book has a special ISBN(International Standard Book Number) which is  unique numeric book identifier only for Voldemort's book printed on it. The ISBN is based upon a 10-digit code. The ISBN is valid if:
// 1xdigit1 + 2xdigit2 + 3xdigit3 + 4xdigit4 + 5xdigit5 + 6xdigit6 + 7xdigit7 + 8xdigit8 + 9xdigit9 + 10xdigit10 is divisible by 11.
// Help Harry to find the book!
// Input:
 // Input the ISBN code as a 10-digit integer.

// Output:
// If the ISBN is not a 10-digit integer, output the message “Illegal ISBN” and terminate the program.
// If the number is 10-digit, extract the digits of the number and compute the sum as explained in the explanation.
// If the sum is divisible by 11, output the message, “Legal ISBN”. If the sum is not divisible by 11, output the message, “Illegal ISBN”.

// SAMPLE INPUT 
// 1401601499

// SAMPLE OUTPUT 
// Legal ISBN


// trying to make changes

import java.util.Scanner;
public class Voldemorts_Potion{
    public static void main(String[] args){
        int count;
        int lastDigit = 0;
        int i = 0;
        int total = 0;
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the code : ");
        // we have taken long because if someone enters
        // a very large input eg. 102356412345
        long num = sc.nextLong();
        long no = num;
        
        count = countDigits(num);
        
        if(count == 10){
            for(i = 10; i > 0; i--){
                // type casting from long to int is done.
                lastDigit =(int)no % 10;
                int finalNum = lastDigit * i;
                total = total + finalNum;
                no = no / 10;
            }
            
            if(total % 11 == 0){
                System.out.println("Legal ISBN");
            }
            
            else{
                System.out.println("Illegal ISBN");
            }
        }
        
        
        else{
            System.out.println("Illegal ISBN");
        }
        sc.close();
    }
   
    public static int countDigits(long num){
        int count = 0;
        while(num != 0){
            num = num/10;
            count++;
        }
        
        //System.out.println(count);
        
        return count;
    }

}
