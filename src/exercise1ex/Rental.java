package exercise1ex;

import java.time.LocalDate;
import java.time.Period;

public class Rental {
    
    private final String clientName;
    private final long clientID;
    private final LocalDate rentalDate;
    private final LocalDate returnDate;
    private final int position;
    private final Ship ship;

    public Rental(String clientName, long clientID, LocalDate rentalDate, 
            LocalDate returnDate, int position, Ship ship) {
        this.clientName = clientName;
        this.clientID = clientID;
        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.position = position;
        this.ship = ship;
    }
    
    public long getValue() {
        int rentalDays = Period.between(rentalDate, returnDate).getDays();
        return rentalDays * ship.getModule();
    }
    
    public String getClientName() {
        return clientName;
    }

    public long getClientID() {
        return clientID;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public int getPosition() {
        return position;
    }

    public Ship getShip() {
        return ship;
    }

    @Override
    public String toString() {
        return "Alquiler\n" 
                + "Nombre del cliente: " + clientName 
                + "\nID del cliente: " + clientID 
                + "\nFecha de alquiler: " + rentalDate 
                + "\nFecha de entrega: " + returnDate 
                + "\nPosición de amarre: " + position 
                + "\nBarco: " + ship
                + "\nValor de alquiler: $" + getValue()
                + "\n";
    }
    
}
