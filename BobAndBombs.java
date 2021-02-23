// Problem
// Bob and Khatu are brave soldiers in World War 3. They have spotted an enemy troop which is planting bombs. They sent message to the command centre containing characters W and B where W represents a wall and B represents a Bomb. They asked command to tell them how many walls will be destroyed if all bombs explode at once. One bomb can destroy 2 walls on both sides.

// Input:

// First line of input contains number of test cases T. Each test case contains a single string which contains two type of chars 'W' and 'B'.

// Output:

// For each test case print the total number of destroyed wall.

// Constraints:

// 1 ≤ T ≤ 10
// 1 ≤ |S| ≤ 105

// Sample Input
// 3
// WBW
// WWBWWBW
// BWWWBWBWW
// Sample Output
// 2
// 5
// 6


import java.util.*;
public class BobAndBombs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String B = "B"; // bombs
        String W = "W"; // walls 
        int count = 0;
        
        int T = sc.nextInt();
        
        if(T >= 1 && T <= 10){
            for(int j = 0; j < T; j++){
                String input = sc.next(); // taking input string
                if(input.length() >= 1 && input.length() <= Math.pow(10,5)){
                   // padding the input string at the starting and ending with String AA,
                   // so that no if-else case fails,i.e if a wall(W) is present at location 0 or 1 or at the end of string or end -1 position
                   // the if else statements could fail.
                   input = "AA" + input + "AA"; 
                   
                   for(int i = 0; i < input.length(); i++){
                        if(input.charAt(i) == W.charAt(0)){
                            if(input.charAt(i - 1) == B.charAt(0)){
                                count += 1;
                            }
                            else if(input.charAt(i - 2) == B.charAt(0)){
                                count += 1;
                            }
                            else if(input.charAt(i + 1) == B.charAt(0)){
                                count += 1;
                            }
                            else if(input.charAt(i + 2) == B.charAt(0)){
                                count += 1;
                            }
                        }
                   }
                } 
                System.out.println(count);
                count = 0; //setting count to 0 for a new iteration of input string
            }   
            
        }
        
        
    }
}
