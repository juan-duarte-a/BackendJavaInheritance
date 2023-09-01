package exercise2;

import java.util.Scanner;

public class Appliance {
    
    protected int price;
    private Color color;
    private PowerConsumption powerConsumption;
    private double weight;
    protected static final int BASE_PRICE = 1000;
    
    public enum Color {BLANCO, NEGRO, AZUL, ROJO, GRIS};
    
    public enum PowerConsumption {
        A (1000),
        B (800),
        C (600),
        D (500),
        E (300),
        F (100);
        
        private final int priceOffset;
        
        PowerConsumption(int price) {
            this.priceOffset = price;
        }
        
        int getPriceOffset() {
            return priceOffset;
        }
    }

    protected Appliance(Color color, PowerConsumption powerConsumption, double weight) {
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.finalPrice();
    }
    
    protected static Appliance createApplience() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Color color;
        System.out.println("Ingresar color del electrodoméstico (blanco, negro, azul, rojo, gris):");
        try {
            color = Color.valueOf(sc.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            color = Color.BLANCO;
            System.err.println("Color incorrecto. Establecido como " + color);
        }
        
        PowerConsumption powerConsumption;
        System.out.println("Ingresar consumo de energía (A-F):");
        try {
            powerConsumption = PowerConsumption.valueOf(sc.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            powerConsumption = PowerConsumption.F;
            System.err.println("Consumo de energia incorrecto. Establecido como " + powerConsumption);
        }
        
        System.out.println("Ingresar peso (Kg):");
        double weight = sc. nextDouble();
        
        return new Appliance(color, powerConsumption, weight);
    }
    
    private void finalPrice() {
        int priceOffset;
        
        if (weight < 20)
            priceOffset = 100;
        else if (weight < 50)
            priceOffset = 500;
        else if (weight < 80)
            priceOffset = 800;
        else
            priceOffset = 1000;
        
        price = BASE_PRICE + powerConsumption.getPriceOffset() + priceOffset;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public PowerConsumption getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(PowerConsumption powerConsumption) {
        this.powerConsumption = powerConsumption;
        finalPrice();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Color " + color.toString().toLowerCase()
                + ". Consumo de energía: " + powerConsumption
                + ". Peso " + weight;
    }
    
}
