package exercise2;

import java.util.Scanner;

public class Appliance {
    
    private int price;
    private Color color;
    private char powerConsumption;
    private double weight;
    
    public enum Color {BLANCO, NEGRO, AZUL, ROJO, GRIS};

    public Appliance(int price, Color color, char powerConsumption, double weight) {
        this.price = price;
        this.color = color;
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        
        powerConsumptionCheck();
        colorCheck();
    }
    
    public void createApplience() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingresar precio del electrodomestico:");
        price = sc.nextInt();
        
        System.out.println("Ingresar color del electrodoméstico (blanco, negro, azul, rojo, gris):");
        
        try {
            color = Color.valueOf(sc.next().toUpperCase());
        } catch (IllegalArgumentException e) {
            colorCheck();
        }
        
        System.out.println("Ingresar consumo de energía (A-F):");
        powerConsumption = sc.next().toUpperCase().charAt(0);
        
        System.out.println("Ingresar peso:");
        weight = sc. nextDouble();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public char getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(char powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private void powerConsumptionCheck() {
        if (powerConsumption < 'A' || powerConsumption > 'F')
            powerConsumption = 'F';
    }
    
    private void colorCheck() {
        if (color == null)
            color = Color.BLANCO;
    }
    
}
