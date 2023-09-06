package exercise1ex;

public class Motorboat extends Ship {
    
    private final int horsepower;

    public Motorboat(String registrationNumber, int length, int year, int horsepower) {
        super(registrationNumber, length, year);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
    
    @Override
    public int getModule() {
        return super.getModule() + horsepower;
    }
    
    @Override
    public String toString() {
        return "Barco a motor -> " + super.toString() + ", potencia (CV): " + horsepower;
    }

}
