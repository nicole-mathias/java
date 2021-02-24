// The problem contains some matrix images, which cannot be added here,
// to view the problem statement visit link:
// https://www.hackerearth.com/practice/basic-programming/implementation/basics-of-implementation/practice-problems/algorithm/the-pattern-c9e759e9/

// Problem:
// Joey is always in fond of playing with patterns. So on his birthday his uncle gave him a mat.  Mat is a rectangular grid\((N*M)\). i.e. there are \(N\) rows and \(M\) columns drawn on the mat.  Each cell of this grid is filled with either dot\((.)\) or star\((*)\). Now Joey starts to fold this mat.  Firstly he folds the mat along the rows (top to down) until it transforms into a \((1*M)\) grid (Neglect width of mat on each fold). After that he starts folding this along the columns (left to right) and finally transforms into a single cell. At the end Joey wants to know what will be on the top of that cell \((\)dot \((.) \)or star\((*))\).

// See the below image for more explanation.
// img

// When star\((*)\) come over dot\((.) \) it converted to dot\((.) \)
// When star\((*)\) come over star\((*)\), it remains star\((*)\)
// When dot\((.) \) come over dot\((.) \), it remains dot\((.) \)
// When dot\((.) \) come over star\((*)\), it converted to star\((*)\)

// Input:
// First line of Input contains an integer \(T\), denoting no of testcases.
// First line of each testcase contains two integers \(N\) and \(M\), no of rows and columns in the grid(respectively).
// Each of next \(N\) lines contains a string of length \(M\).

// Output:
// For each testcase print a single line, the character on the top of folded mat.

// Constraints:
    // \(1 \leq T \leq 100\)
    // \(1 \leq N, M \leq 10^3\)

// Sample Input
// 1
// 5 5
// *.***
// .**..
// .*.*.
// *...*
// ..*.*
// Sample Output
// *



import java.util.Scanner; // importing only what is needed instead of the full util package, as it exceeds the the given time limit on hackearth
//import java.util.*;
public class thePattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of test cases:");
        int T = sc.nextInt(); // no of test cases
        
        String input = ""; //initializing an empty input string
        
        if(T >= 1 && T <= 100){
            for(int j = 0; j < T; j++){
                System.out.println("Enter the number of rows:");
                int N = sc.nextInt(); // no of rows
                
                System.out.println("Enter the number of columns:");
                int M = sc.nextInt(); // no of columns
                
                if(N >= 1 && N <= Math.pow(10,3) && M >= 1 && M <= Math.pow(10,3)){
                    for(int i = 0; i < N; i++){
                        input = sc.next();              
                    }
                    
                    // we are scanning all the rows,
                    // but we are storing only the last row in out input
                    // and then taking the last element from the stored input string.
                    System.out.println(input.charAt(M - 1));
                    
                }
            
            }
        }
            
        
    }
}
