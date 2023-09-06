package exercise1ex;

public class Sailboat extends Ship {
    
    private final int masts;

    public Sailboat(String registrationNumber, int length, int year, int masts) {
        super(registrationNumber, length, year);
        this.masts = masts;
    }

    public int getMasts() {
        return masts;
    }
    
    @Override
    public int getModule() {
        return super.getModule() + masts;
    }

    @Override
    public String toString() {
        return "Velero -> " + super.toString() + ", mástiles: " + masts;
    }
    
}
