package exercise4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<ShapeCalculations> shapes = new ArrayList<>();
        
        shapes.add(new Triangle(4, 6));
        shapes.add(new Triangle(5, 3));
        shapes.add(new Circle(5));
        shapes.add(new Circle(8));
        
        shapes.forEach(System.out::println);
        
        Circle c = new Circle(5);
        c.setRadius(6);
        
    }
    
}
