import java.util.*;
public class leapYear {
    
    public static boolean isLeap(int year){
        if(year >= 1000 && year <= 9999){
            if(year % 4 == 0){
                if(year % 100 == 0 && year % 400 == 0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }  
    }
    
    
    public static void main(String args[]) {
        System.out.println(isLeap(2000));
        System.out.println(isLeap(2400));
        System.out.println(isLeap(2200));
        System.out.println(isLeap(2500));
        
    }

}
