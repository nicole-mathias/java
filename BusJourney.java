// -----------------PROBLEM TAKEN FROM HACKEREARTH : Bus Journey-------------------------------


// It is a lovely day in Astana, Kazakhstan, and our friend Mahamba is headed to international exhibition EXPO2017.
// The route to the main pavilion consists of N bus stops, and Mahamba will leave the bus on Nth stop. 
// Additionally, the bus has M seats and can support an infinite number of standing people. 
// Mahamba is sitting in bus already, and it is approaching the first bus stop. By pure luck, he knows that ai adults 
// will enter and bi sitting adults will leave on ith bus stop for every 1 <= i < N (if there are no sitting adults, no one will 
// leave). He also knows that people leave and only then new people come in. As Mahamba is a schoolboy, he must 
// give his place to an adult person. If a sitting person leaves the bus, standing adult will take his place. 
// After there are no standing adults left on the bus and there is a vacant place, he can finally sit down. 
// Mahamba now wants to know how many stops he will ride standing up, as it is a very tiring experience

// Input format

// The first line contains N and M - the number of stops and the number of seats in a bus, respectively. 
// The next  lines contain ai and bi , denoting the number of people entering and leaving the bus at each stop.

// Output format

// The first and only line should contain one number - the answer to Mahamba's question.

// Constrains
// 2 <= N <= 500
// 1 <=M <= 500
// 0 <= ai,bi <= 500

// SAMPLE INPUT 
// 5 5
// 1 0
// 2 1
// 5 2
// 0 0

// SAMPLE OUTPUT 
// 2

// Explanation
// On first bus stop, 1 person came in, so there are 4 vacant places in a bus. On the second stop, 
// the sitting person left the bus and 2 new people came in, so there are still 3 seats available. 
// On the third bus stop, 2 sitting people left the bus, 5 new people came in, so there are no vacant places anymore. 
// Thus, you have to ride 2 stops standing: 3 and 4, so the answer is 2.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class BusJourney{
    public static void main(String[] args) throws Exception{
        int c = 0,d = 0;
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        // we are using tokenizer, instead of string split because, tokenizer is faster in speed
        // tokenizer is used to break a string,seperated by spaces or commas or anything.
        StringTokenizer st = new StringTokenizer(str," "); // here string is seperated by spaces " "
        
        // st.nextElement() gives the single part seperated from the string,
        // then we convert it to a string, so the we can parse it as an integer, 
        // directly you cannot parse it into an integer
        int n = Integer.parseInt(st.nextElement().toString()); // number of stops
        int m = Integer.parseInt(st.nextElement().toString()); // number to seats
        
        
        int count = 0;
        
        if(n >= 2 && n <= 500 && m >= 1 && m <= 500){
            // for n-1 lines
            for(int i = 0; i < n-1; i++){
                String str2 = br.readLine();
                StringTokenizer st2 = new StringTokenizer(str2," ");
                int a = Integer.parseInt(st2.nextElement().toString()); //number of people entering
                int b = Integer.parseInt(st2.nextElement().toString()); // number of people leaving
                
                if(a >= 0 && a <= 500 && b >= 0 && b <= 500){
                    // to get the people remaining who did not leave the bus at the next stop
                    int remaining_people = b - c;
                    
                    //this case is taken cause while subtracting if we get a negative number, we convert
                    //it to positive number
                    if(remaining_people < 0){
                        remaining_people = -remaining_people;
                    }
                    
                    // current total number of people in the bus
                    // i.e the people entering + the remaining people who were already present in the bus
                    int total = a + remaining_people;
                    
                    // here we are considering total >= m, because it is not necessary that the
                    //max number of people will be equal to m only, remember there are people standing also
                    // these standing people can take the seat, Mahamba can take the seat only when no one is
                    //standing and there is a vacant seat.
                    if(total >= m){
                        count++;
                    }
                    c = total; // storing the no of people who entered at the bus stop
                    
                }
                
            }
        
            
        }
        
        System.out.println(count);
        
    }
    
}