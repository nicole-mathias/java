/*
    Bob and Khatu are stuck in matrix. The command center sent them a string which decodes to the their final destination. Since Bob and Khatu are not good at problem solving help them to figure out their final destination. They are initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command they will traverse 1 unit distance in the respective direction. For example if they are at (2, 0) and the command is they will go to (1, 0).
    Input:
        *Input contains a single string.
    Output:
        *Print the final destination location of Bob and Khatu.
    Explanation:
        Initial Position : 0, 0
        1.) 'L' -> cover one unit of distance in left direction. New position (-1,0)
        2.) 'L' -> new position (-2,0)
        3.) 'R' -> new position (-1,0)
        4.) 'D' -> new position (-1,-1)
        5.) 'D' -> new position (-1,-2)
        6.) 'R' -> new position (0,-2)
    Example:
        Input:          Output:
        LLRDDR           0 -2
 */
import java.util.Scanner;
public class FinalDestination {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //String input = "LLRDDR";
        // L,R changes columns
        // U,D changes rows
        int position1 = 0;  //for rows
        int position2 = 0;  //for columns
       
        for(int i=0; i<input.length(); i++){
            char move = input.charAt(i);
            
            switch(move){
                case 'L' : position1--;
                break;
                
                case 'R' : position1++;
                break;
                
                case 'D' : position2--;
                break;
                
                case 'U' : position2++;
                break;
                
                default : System.out.println("You entered a wrong string");
                break;
            }
        }
        
        System.out.print("The new position : ");
        System.out.print(position1 + "," + position2);
        
    }

}
