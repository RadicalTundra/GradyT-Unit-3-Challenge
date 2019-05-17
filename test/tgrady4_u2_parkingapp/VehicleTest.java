/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgrady4_u2_parkingapp;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author tgrady4
 */
public class VehicleTest {

    Vehicle car1;

    @Before
    public void setup()
    {
        car1 = new Vehicle(100);
    }
    
    @Test
    public void getId()
    {
        assertEquals(car1.getId(), 100);
    }
    
}
