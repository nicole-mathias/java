
public class Rectangle extends Shape{
    int answer, l, b;
    public void printShape(){
        System.out.println("This is a rectangle");
    }
    
    public void area(){
       answer = l * b;
       System.out.println("Rect area is: " + answer);
    }
    
}
