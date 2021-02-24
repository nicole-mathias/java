
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
