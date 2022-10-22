package shape;

/**
 *
 * @author
 */
public class Rectangle {

    private int length; 
    private int breadth; 
    
    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
    
    public int getArea() { 
         return length*breadth;     //  calculate area here
    } 
    //// create method to find perimeter rectangle
    public int getPerimeter() {
        return 2*(length+breadth); 
    }
      ///// calculate the perimeters   
     // getPerimeter()
/// test
}
