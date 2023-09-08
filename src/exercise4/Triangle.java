package exercise4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle implements ShapeCalculations {
    
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * (base * height);
    }

    @Override
    public double getArea() {
        return base * height;
    }

    @Override
    public String toString() {
        return "Triángulo. " + "Base: " + base + ", altura: " + height 
                + ", área: " + getArea() + ", perímetro: " + getPerimeter();
    }

}
