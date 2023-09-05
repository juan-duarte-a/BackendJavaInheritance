package exercise2_3;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Appliance> appliances = new ArrayList<>();
        addAppliences(appliances);
        appliances.forEach(System.out::println);
        System.out.print("\nPrecio total: $");
        System.out.println(appliances.stream().mapToInt(Appliance::getPrice).sum());
        
        System.out.println();
        WashingMachine washingMachine = WashingMachine.createWashingMachine();
        Television television = Television.createTelevision();
        
        System.out.println(washingMachine);
        System.out.println(television);
    }
    
    public static void addAppliences(ArrayList<Appliance> list) {
        list.add(new Television(
                36, 
                true, 
                Appliance.Color.NEGRO, 
                Appliance.PowerConsumption.C, 
                6));
        list.add(new WashingMachine(
                25, 
                Appliance.Color.GRIS, 
                Appliance.PowerConsumption.D, 
                32));
        list.add(new WashingMachine(
                28, 
                Appliance.Color.BLANCO, 
                Appliance.PowerConsumption.B, 
                20));
        list.add(new Television(
                55, 
                false, 
                Appliance.Color.NEGRO, 
                Appliance.PowerConsumption.D, 
                11));
    }
    
}
