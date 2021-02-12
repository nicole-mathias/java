import java.util.*;
public class Bank{
    String name;
    float balance,deposit, withdraw;
    // constructor
    public Bank(String name){
        this.name = name;
        System.out.println("Name : " + name);
    }
    
    public void depositAmount(float deposit){
        this.balance = balance + deposit;
        getBalance();
    }
    
    public void withdrawAmount(float withdraw){
        if(withdraw > balance){
            System.out.println("Less balance");
            getBalance();
        }
        else{
            this.balance = balance - withdraw;
            getBalance();
        }
    }
    
    public void getBalance(){
        System.out.println("Balance : " + balance);
        System.out.print("\n");
    }
      
}
