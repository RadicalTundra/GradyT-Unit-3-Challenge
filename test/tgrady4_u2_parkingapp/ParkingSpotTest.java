/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tgrady4_u2_parkingapp;
import java.time.LocalTime;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Teddy
 */
public class ParkingSpotTest {
    LocalTime hour;
    Vehicle car1;
    ParkingSpot spot;
    
    @Before
    public void setup()
    {
        car1 = new Vehicle(100);
        hour = LocalTime.of(1, 0);
        spot = new ParkingSpot(car1, hour);
    }
    
    @Test
    public void getCar()
    {
        assertEquals(spot.getCar(), car1);
    }
    
    @Test
    public void getTime()
    {
        assertEquals(spot.getTime(), hour);
    }

}
