// Little Jhool always wanted to have some psychic powers so that he could showoff his skills, and magic to people and impress them. (Specially, his girlfriend Big Jhool!) But, in spite all his efforts, hardwork, dedication, Googling, watching youtube videos he couldn't garner any psychic abilities!

// He knew everyone was making fun of him, so to stop all of that - he came up with a smart plan. Anyone who came to him to know about their future, he asked them to write a binary number for him - and then, he smartly told them if the future for that person had good in store, or bad.

// The algorithm which Little Jhool follows is, as following:

// If the binary number written by the person has six consecutive , or , his future is bad.
// Otherwise, he says that their future is good.
// Input format:

// Single line contains a binary number.

// Output format:

// You need to print "Good luck!" (Without quotes, and WITH exclamation mark!) if the Jhool is going to tell them that they're going to have a good time. Else, print "Sorry, sorry!" if the person is going to be told that he'll have a hard time!

// Constraints:

// The binary number will be in string format, with the maximum length being  characters.

// SAMPLE INPUT 
// 0001111110

// SAMPLE OUTPUT 
// Sorry, sorry!

import java.util.Scanner;
public class LittleJhool{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers in binary format : ");
        String number = sc.next();
        
        //String number = "0001111110";
        //System.out.println(number);
        
        int count = number.length();
        
        int match = 0; // variable to check number of same number occurrences consecutively.
        for(int i = 0; i < count-1; i++){
            if(number.charAt(i) == number.charAt(i+1)){
                match++;
                
                // while comparing there should 5 macthes back to back to
                // get the same numbers 6 times consecutively.
                if(match == 5){
                    break;
                }
            }
            else{
                match = 0;
            }
            
        }
        
        if(match == 5){
            System.out.println("Sorry, sorry!");
        }
        
        
        else{
            System.out.println("Good luck!");
        }
        
        
    }
    
}


