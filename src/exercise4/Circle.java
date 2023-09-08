package exercise4;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Circle implements ShapeCalculations {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
        
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Círculo. " + "Radio: " + radius 
                + ", área: " + getArea() + ", perímetro: " + getPerimeter();
    }
    
}
