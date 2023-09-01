package exercise2;

public class Main {
    
    public static void main(String[] args) {
        WashingMachine washingMachine = WashingMachine.createWashingMachine();
        Television television = Television.createTelevision();
        
        System.out.println(washingMachine);
        System.out.println(television);
    }
    
}
