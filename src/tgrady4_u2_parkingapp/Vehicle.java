/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgrady4_u2_parkingapp;

/**
 *
 * @author Teddy
 */
public class Vehicle {
    private int id;
     /**
     *
     * Just gives a vehicle an id.
     * @param id
     * 
     */
    public Vehicle(int id){
        this.id = id;
    }
    
    /**
     *
     * @return id
     */
    public int getId(){
        return id;
    }
}
