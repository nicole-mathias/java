// Mr. X's birthday is in next month. This time he is planning to invite N of his friends. He wants to distribute some chocolates to all of his friends after party. He went to a shop to buy a packet of chocolates.
// At chocolate shop, each packet is having different number of chocolates. He wants to buy such a packet which contains number of chocolates, which can be distributed equally among all of his friends.
// Help Mr. X to buy such a packet.

// Input:
// First line contains T, number of test cases.
// Each test case contains two integers, N and M. where is N is number of friends and M is number number of chocolates in a packet.

// Output:
// In each test case output "Yes" if he can buy that packet and "No" if he can't buy that packet.

// Constraints:
// 1<=T<=20
// 1<=N<=100
// 1<=M<=10^5

// SAMPLE INPUT 
// 2
// 5 14
// 3 21

// SAMPLE OUTPUT 
// No
// Yes
import java.util.Scanner;
public class BirthdayParty{
    public static void answer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int t = sc.nextInt(); //test cases

        if(t >= 1 && t <= 20){
            for(int i = 0; i < t; i++){
                System.out.println("Enter the number of friends");
                int n = sc.nextInt(); // number of friends
                
                System.out.println("Enter the number of chocolates");
                int m = sc.nextInt(); // number of chocolates
                
                if(n >= 1 && n <= 100 && m >= 1 && m <= 100000){
                    if(m % n == 0){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }
                }
            }   
        }
    }
    
    public static void main(String[] args){
        answer();
    }
   
}
    

