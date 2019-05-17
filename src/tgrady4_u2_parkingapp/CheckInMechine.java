/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgrady4_u2_parkingapp;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Teddy
 */
public class CheckInMechine {
                    
    private List<Vehicle> vehicles = new ArrayList();
    private List<ParkingSpot> parkingSpots = new ArrayList();
    private List<Ticket> tickets = new ArrayList();
    private int id = 100;
    private Random rand = new Random();
    
    /**
     *
     * @param vehicles a list of vehicles.
     * @param parkingSpots a list of parking spots.
     * @param tickets a list of tickets.
     */
    public CheckInMechine(List<Vehicle> vehicles, List<ParkingSpot> parkingSpots, List<Ticket> tickets){
        this.vehicles = vehicles;
        this.parkingSpots = parkingSpots;
        this.tickets = tickets;
        if(tickets.size() > 0){
        this.id = tickets.get(tickets.size() - 1).getId() + 1;
        }
    }
    
    /**
     *  This function takes a new car, checks it in by removing it from the parking space, then adds a ticket with the same id for it.
     */
    public void newCarCheckIn(){
        int hourOfDay = rand.nextInt(6);
        hourOfDay = hourOfDay + 7;
        LocalTime timeEntered = LocalTime.of(hourOfDay, 0);
        Vehicle newCar = new Vehicle(id);
        vehicles.add(newCar);
        parkingSpots.add(grabSpot(vehicles.get(vehicles.size() - 1), timeEntered));
        System.out.println("\nCheck in successful.");
        System.out.println("Your car's id is: " + parkingSpots.get(parkingSpots.size() - 1).getCar().getId() + "\n");
        Ticket newTicket = new Ticket(id);
        tickets.add(newTicket);
        id++;
    }
    
    /**
     *
     * @return a list of tickets.
     */
    public List<Ticket> getTicket(){
        return tickets;
    }
    
    /**
     *
     * @param car a vehicle.
     * @param hour a local time.
     * @return returns a parking spot for the car that is just checked in.
     */
    public static ParkingSpot grabSpot(Vehicle car, LocalTime hour){
        ParkingSpot spot = new ParkingSpot(car, hour);
        return spot;
    }
}
