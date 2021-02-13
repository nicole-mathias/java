// On one fine evening Ravi goes to a city and he observes that there is something different in this city 
// than the other normal cities. The city has two ponds with lotus flowers in it. The ponds are nearby each 
// other.
// Pond1 has capacity of infinite lotus and Pond2 has capacity of only N lotus. On first day Ravi 
// put 1 lotus in Pond2 and after every 24 hours the total count of lotus doubles.
// day :   1 2 3 4 5 6 ......
// count : 1 2 4 8 16 32 ....
// If on any particular day Pond2 overflows, then Ravi transfers only N lotus to Pond1 and discard the 
// rest of the lotus.
// From the next day, Ravi starts with 1 lotus again and repeat the process infinitely.

// Determine the  number of days in which the total count of lotus crosses K(greater or equal).

// Note:
   // * Total count is equal to the lotus in Pond1 + Pond2.
   // * Lotus doubles in Pond2 only not in Pond1.
   
// Input format:
    // * The first line contains a single integer T denoting the number of test cases. The description of
      // T test cases follows.
    // * Each test case contains two integers denoting N and the value of K.

// Output format:
    // * For each test case, print a single line containing the number of days.
    
// Constraints:
    // 1<=T<=10000
    // 2<=N<=1e18
    // 2<=K<=1e18
    
// Sample Input:
// 3
// 72 61
// 72 79
// 72 80

// Output:
// 7
// 12
// 12

import java.util.*;
public class FineEvening{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        
        int t = sc.nextInt();
        if(t >= 1 && t <= 10000){
            for(long i = 0; i < t; i++){
                long n = sc.nextInt();
                long k = sc.nextInt();
                
                long count = 1;
                long days = 1;
                long countK = 1;
                long daysK = 1;
                
                if(n >= 2 && n <= Math.pow(10,18) && k >= 2 && k <= Math.pow(10,18)){
                    if(n < k){
                        while(count < n){
                        count = count * 2;
                        days++;
                        }
                        
                        long a = k - n;
                        while(countK < a){
                        countK = countK * 2;
                        daysK++;
                        }
                        System.out.println(days + daysK);
                    }
                    
                    else{
                        while(count < k){
                            count = count * 2;
                            days++;
                        }
                        System.out.println(days);
                    }
                    
                }
                
                
                else{
                    break;
                }
            }
        }
    }
}
