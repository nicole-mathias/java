


// You are required to enter a word that consists of  and  that denote the number of Zs and Os respectively. The input word is considered similar to word zoo if 
// 2 * x = y.

// Determine if the entered word is similar to word zoo.

// For example, words such as zzoooo and zzzoooooo are similar to word zoo but not the words such as zzooo and zzzooooo.







// we are using BufferedRead to increase the speed of the program, so that the input is read faster.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zoo {
    // if throws Exception is not written, then the error throw by 
    // String name = br.readLine(); wont be handled.
    public static void main(final String[] args) throws Exception {
        int countZ = 0;
        int countO = 0;

        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter input String");
        final String name = br.readLine();
        
        
        for(int i=0; i < name.length(); i++){
            if(name.charAt(i) == 'z'){
                countZ++;
            }
            else if(name.charAt(i) == 'o'){
                countO++;
            }
    
        }
        
        if((2 * countZ) == countO){
            System.out.println("Yes");
        }
        
        else{
            System.out.println("No");
        }
        
    }
    
}