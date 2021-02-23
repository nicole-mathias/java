// Problem:
// Given two integers X and K, find the largest number that can be formed by changing digits at atmost K places in the number X.

// Input:

// First line of the input contains two integers X and K separated by a single space.

// Output:

// Print the largest number formed in a single line.

// Constraints:

// \(1\le X \le 10^{18}\)
// \(0 \le K \le 9\)

// Sample Input
// 4483 2
// Sample Output
// 9983

// Sample Input
// 572836516399388784 9
// Sample Output
// 999999999399388784

import java.util.*;
public class DigitProblem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of X");
        long X = sc.nextLong(); // long is used, so that large inputs can be taken
        
        System.out.println("Enter the value of K");
        int K = sc.nextInt();
        
        String A = String.valueOf(X);
        String C = ""; //empty string
        
        
        if(X >= 1 && X <= Math.pow(10,18) && K >= 0 && K <= 9){
            for(int i = 0; i < K; i++){
                C = C + "9";           
            }            
        }
        
        C = C + A.substring(K, A.length());
        System.out.print("Output: " + C);
           
    }
    
   
}
