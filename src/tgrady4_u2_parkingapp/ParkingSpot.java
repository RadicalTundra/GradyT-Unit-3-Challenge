/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgrady4_u2_parkingapp;

import java.time.LocalTime;


/**
 *
 * @author Teddy
 */
public class ParkingSpot {
    private Vehicle car;
    private LocalTime time;
    
    /**
     *
     * @param car of the type Vehicle.
     * @param time of type LocalTime.
     */
    public ParkingSpot(Vehicle car, LocalTime time){
        this.car = car;
        this.time = time;
    }
    
    /**
     *
     * @return returns the car in this parking spot.
     */
    public Vehicle getCar(){
        return car;
    }
    
    /**
     *
     * @return returns when the car got into the parking spot.
     */
    public LocalTime getTime(){
        return time;
    }
}
