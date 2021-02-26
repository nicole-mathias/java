
public class Square extends Rectangle{
    public void printShape(){
        System.out.println("Square is a rectangle");
    }
    
    public static void main(String args[]){
        
        Shape s = new Shape();
        s.printShape();
        
        Rectangle r = new Rectangle();
        r.printShape();
        r.l = 2;
        r.b = 4;
        r.area();
        
        Circle c = new Circle();
        c.printShape();
    }
    
}
