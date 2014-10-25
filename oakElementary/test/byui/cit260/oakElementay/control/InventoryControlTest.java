/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oakElementay.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kory/ Taylor
 * 
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test of calcCoinsNeeded method, of class InventoryControl.
     */
    @Test
    public void testCalcCoinsNeeded() {
        System.out.println("calcCoinsNeeded");
        
        System.out.println("\tTest case #1");
        
        double coins = 10.0;
        double cost = 5.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 5.0;
        double result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("\tTest case #2");
        
        coins = 4.0;
        cost = 5.0;
        
        expResult = -1.0;
        result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        System.out.println("\tTest case #3");
        
        coins = 1.0;
        cost = 5.0;
        
        expResult = -1.0;
        result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("\tTest case #4");
        
        coins = -3.0;
        cost = 5.0;
        
        expResult = -1.0;
        result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("\tTest case #5");
        
        coins = 5.0;
        cost = 5.0;
        
        expResult = 0.0;
        result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("\tTest case #6");
        
        coins = 100.0;
        cost = 5.0;
        
        expResult = 95.0;
        result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        System.out.println("\tTest case #7");
        
        coins = 1000.0;
        cost = 5.0;
        
        expResult = 995.0;
        result = instance.calcCoinsNeeded(coins, cost);
        assertEquals(expResult, result, 0.0001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        
        
    }
    
}
