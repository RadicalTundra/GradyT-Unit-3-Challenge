package tgrady4_u2_parkingapp;

import java.util.List;

/**
 *
 * @author Teddy
 */
public interface CheckOutStrategy {

    /**
     * this function is used to check out a car, it takes the first one out of the parking spots list and gives it a cost based on the class used.
     * @param parkingSpots A list of parking spots.
     * @param tickets a list of tickets. 
     */
    public void checkOut(List<ParkingSpot> parkingSpots, List<Ticket> tickets);
    
    /**
     *
     * @return returns total amount of money.
     */
    public double getTotal();
    
    /**
     *
     * @return total amount of tickets collected this way.
     */
    public int getTotalCheckIns();
    
    /**
     * displays and calculates the totals.
     */
    public void displayTotals();
}
