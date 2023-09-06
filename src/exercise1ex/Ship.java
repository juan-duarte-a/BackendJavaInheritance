package exercise1ex;

public class Ship {
    
    private final String registrationNumber;
    private final int length;
    private final int year;

    public Ship(String registrationNumber, int length, int year) {
        this.registrationNumber = registrationNumber;
        this.length = length;
        this.year = year;
    }
    
    protected int getModule() {
        return length * 10;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "licencia: " + registrationNumber + ", eslora: " + length + ", año: " + year;
    }
    
}
