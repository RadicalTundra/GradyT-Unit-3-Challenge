/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgrady4_u2_parkingapp;

/**
 *
 * @author tgrady4
 */
public class Ticket {
    private int id;
    private double cost;
    
    /**
     *This constructor is just for when the ticket is first created.
     * 
     * @param id
     */
    public Ticket(int id){
        this.id = id;
        cost = 0;
    }
    
    /**
     *
     * This constructor is for when a ticket comes back from the fileInput class.
     * 
     * @param id
     * @param cost
     */
    public Ticket(int id, double cost)
    {
        this.id = id;
        this.cost = cost;
    }
    
    /**
     *
     * @return id
     */
    public int getId(){
        return id;
    }
    
    /**
     *
     * @return cost
     */
    public double getCost()
    {
        return cost;
    }
    
    /**
     *
     * @param cost
     */
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    
}
