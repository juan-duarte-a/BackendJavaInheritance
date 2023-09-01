package exercise2;

import java.util.Scanner;

public class WashingMachine extends Appliance {
    
    private int load;
    private int priceOffset;

    public WashingMachine(int load, Color color, PowerConsumption powerConsumption, double weight) {
        super(color, powerConsumption, weight);
        this.load = load;
        finalPrice();
    }
    
    public static WashingMachine createWashingMachine() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Crear lavadora");
        Appliance appliance = Appliance.createApplience();
        
        System.out.println("Ingresar carga (Kg):");
        int load = sc.nextInt();
        
        return new WashingMachine(
                load, 
                appliance.getColor(), 
                appliance.getPowerConsumption(), 
                appliance.getWeight());
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
        finalPrice();
    }
    
    private void finalPrice() {
        priceOffset = load > 30 ? 500 : 0;
    }
    
    @Override
    public int getPrice() {
        return price + priceOffset;
    }
    
    @Override
    public String toString() {
        return "Lavadora: " + super.toString() 
                + ". Carga " + load + "Kg. Precio $" + getPrice();
    }
    
}
