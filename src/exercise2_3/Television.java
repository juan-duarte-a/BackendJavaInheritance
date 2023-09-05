package exercise2_3;

import java.util.Scanner;

public class Television extends Appliance {
    
    private int size;
    private boolean tdtTuner;
    private int priceOffset;

    public Television(int size, boolean tdtTuner, Color color, PowerConsumption powerConsumption, double weight) {
        super(color, powerConsumption, weight);
        this.size = size;
        this.tdtTuner = tdtTuner;
        finalPrice();
    }
    
    public static Television createTelevision() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Crear televisor");
        Appliance appliance = Appliance.createApplience();
        
        System.out.println("Ingresar tamaño del televisor (pulgadas):");
        int size = sc.nextInt();
        
        System.out.println("¿Tiene sintonizador (S/N)?:");
        boolean tdtTuner = sc.next().toUpperCase().equals("S");
        
        return new Television(
                size, 
                tdtTuner, 
                appliance.getColor(), 
                appliance.getPowerConsumption(), 
                appliance.getWeight());
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean hasTdtTuner() {
        return tdtTuner;
    }

    public void setTdtTuner(boolean tdtTuner) {
        this.tdtTuner = tdtTuner;
    }
    
    private void finalPrice() {
        priceOffset = hasTdtTuner() ? 500 : 0;
    }
    
    @Override
    public int getPrice() {
        return (int) (price * (size > 40 ? 1.3 : 1)) + priceOffset;
    }
    
    @Override
    public String toString() {
        return "Televisor: " + super.toString() + ". Tamaño " + size 
                + " pulgadas. Tiene sintonizador TDT: " + (hasTdtTuner() ? "Sí" : "No")
                + ". Precio $" + getPrice();
    }
    
}
