import java.util.*;
public class Factorial {
    public static void main(String args[]){
        int no; 
        int factorial = 1;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to find factorial");
        no = sc.nextInt();
        
        for(int i = 1; i <= no; i++){
            factorial = factorial * i;
        }
        
        System.out.println("Factorial of " + no + " is " + factorial);
        
    }

}
