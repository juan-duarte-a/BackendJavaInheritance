package exercise1ex;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        ArrayList<Rental> rentals = new ArrayList<>();
        
        Ship sailboat = new Sailboat("AR4654", 6, 2015, 2);
        Ship motorboat = new Motorboat("FG9802", 5, 2012, 90);
        Ship yacht = new LuxuryYacht("VP1025", 12, 2019, 450, 3);
        
        rentals.add(new Rental(
                "Jhon Doe", 
                654378, 
                LocalDate.of(2023, 8, 16),
                LocalDate.of(2023, 9, 2), 
                3, 
                sailboat));
        rentals.add(new Rental(
                "Don Juan", 
                569487, 
                LocalDate.of(2023, 3, 1),
                LocalDate.of(2023, 4, 22), 
                7, 
                motorboat));
        rentals.add(new Rental(
                "Pepita Pérez", 
                193985, 
                LocalDate.of(2023, 6, 9),
                LocalDate.of(2023, 6, 11), 
                2, 
                yacht));
        
        rentals.forEach(System.out::println);
    }
    
}
