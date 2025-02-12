package q1;
//package ;


import org.junit.Test;

import q1.Money;
import junit.framework.TestCase;

/**
 * This is a trivial test which only tests the Money class.
 * If you modify the MoneyBag class, and run Clover with optimization, this test will not be run.
 */
public class MoneyTest extends TestCase {

    public void testAdd() throws InterruptedException {
        Money tenEuro = new Money(10, "EURO");
        assertEquals(10, tenEuro.amount());
        assertEquals("EURO", tenEuro.currency());
        System.out.println("Tests taking too long? Try Clover's test optimization.");
        Thread.sleep(3000);
    }
    
    @Test
    public void testZeroMoneyEqualsZeroIMoney() {
        // Create a zero Money object
        Money zeroMoney = new Money(0, "USD");

        // Create another IMoney instance that is zero
        IMoney zeroIMoney = new Money(0, "CHF"); // Different currency to ensure the comparison is based on the zero amount
        assertTrue("A zero Money object should be considered equal to another zero IMoney instance", zeroMoney.equals(zeroIMoney));
    }
    
    @Test
    public void testMoneyEqualsWithNonMoneyObject() {
        // Create a Money object
        Money money = new Money(10, "USD");

        // Create an object that is not an instance of Money
        Object nonMoneyObject = new Object();
        assertFalse("A Money object should not be equal to an object that is not an instance of Money", money.equals(nonMoneyObject));
    }
        
}
