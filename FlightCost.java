/*
    A family consists of  x members. You are given the task to book flight tickets for these x members.
    You are given the following information about the airline in which you have to book the tickets:
        P: It denotes the cost of one ticket of the flight.
        S: It denotes the number of total available seats in the flight.
        T: If the numbers of available seats are less than or equal to T, then the cost of the flight ticket increases to H.
        H: It denotes the new hiked cost.
    Determine the total cost to book the tickets for all the family members.
    Note: The tickets are booked one by one for all the family members.
    Input format:
        First line: Five space-separated integers P, S, T, H and x respectively.
    Output format:
        Print the total cost to book the tickets for all the members of the family.
    Sample Input:                      Sample Output:
        6000 10 5 6500 7                 43000
        2766 29 16 6848 23               104438
        61427 221 131 66768 4            245708
 */


public class FlightCost {
    public static void main(String[] args){
        getCost("6000 10 5 6500 7");
        getCost("2766 29 16 6848 23");
        getCost("61427 221 131 66768 4");
        
    }
    
    public static void getCost(String cost){
        //String cost = "6000 10 5 6500 7";
        int totalCost = 0;
        String[] arr = cost.split(" ");
        
        // we are converting string type to integer type
        int P = Integer.parseInt(arr[0]); //It denotes the cost of one ticket of the flight.
        int S = Integer.parseInt(arr[1]); //It denotes the number of total available seats in the flight.
        int T = Integer.parseInt(arr[2]); //If the numbers of available seats are less than or equal to T, then the cost of the flight ticket increases to H.
        int H = Integer.parseInt(arr[3]); //It denotes the new hiked cost.
        int X = Integer.parseInt(arr[4]); // denotes the total no.of people
        
        
        for(int i = 0; i < X; i++){
           if( S <= T){
              P = H;
           }
           else if(S > T){
              P = P;
           }
           S--; // deducting the total no of available seets after every single members ticket is booked.
           
           totalCost = totalCost + P;
        }
        
        System.out.println("The total cost for the family : " + totalCost);
    
    }

}
