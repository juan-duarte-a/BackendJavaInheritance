package exercise1ex;

public class LuxuryYacht extends Motorboat {
    
    private final int cabins;

    public LuxuryYacht(String registrationNumber, int length, int year, int Horsepower, int cabins) {
        super(registrationNumber, length, year, Horsepower);
        this.cabins = cabins;
    }

    public int getCabins() {
        return cabins;
    }
    
    @Override
    public int getModule() {
        return super.getModule() + cabins;
    }
    
    @Override
    public String toString() {
        return "Yate de lujo" + super.toString().substring(13) + ", camarotes :" + cabins;
    }

}
