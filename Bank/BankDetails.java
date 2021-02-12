import java.util.*;
public class BankDetails{
    public static int transactionOptions(){
        int i;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an option : ");
        System.out.println("1 - Deposit money");
        System.out.println("2 - Withdraw money");
        System.out.println("3 - Check balance" );
        System.out.println("4 - Exit");
        
        i = sc.nextInt();
        return i;
    }
    
    public static void main(String args[]){
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account holder's name");
        String name = sc.next();
        Bank person = new Bank(name);
        
        i = transactionOptions();
        while(i != 4){
            switch(i){
                case 1: 
                System.out.println("Enter amount to deposit : ");
                float deposit = sc.nextFloat();
                person.depositAmount(deposit);
                break;
                
                case 2:
                System.out.println("Enter amount to withdraw : ");
                float withdraw = sc.nextFloat();
                person.withdrawAmount(withdraw);
                break;
                
                case 3:
                person.getBalance();
                break;
                
                default:System.out.println("You must enter the right option");
                break;

            }
            i = transactionOptions();
        }
        
        
    }
}
