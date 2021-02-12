// You can find factors for both postive and negative numbers.
import java.util.*;
public class AllFactors {
    
    public static void factors(int no){
        if(no > 0){
            for(int i = 1; i <= no; i++){
                if(no % i == 0){
                    System.out.print(i + " ");
                }
            } 
            
        }
        
        else if(no < 0){
            no = no * -1;
            
            for(int i = 1; i <= no; i++){
                if(no % i == 0){
                    System.out.print("-" + i + " ");
                }
            }
        }
        
        else if(no == 0){
            System .out.println("Every number is a factor of 0");
        }
    
    }
    
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("\nEnter a number to find factors: ");
        int no = sc.nextInt();
        
        factors(no);   
    }
    
}


