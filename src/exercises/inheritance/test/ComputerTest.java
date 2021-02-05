package exercises.inheritance.test;

import exercises.inheritance.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ComputerTest {

    Laptop testLaptop;

    @Before
    public void createLaptopObject(){
        testLaptop = new Laptop(1100, 2021, "Samsung", "Windows 10");
    }

    @Test
    public void testPrice(){
        assertEquals(testLaptop.getPrice(), 1100, .001);
    }

    @Test
    public void testYear(){
        assertEquals(testLaptop.getYear(), 2021);
    }

    @Test
    public void testDiscountPrice(){
        assertEquals(testLaptop.discountPrice(10), 990, .001);
    }

    @Test
    public void testIdIsUnique(){
        Laptop secondTestLaptop = new Laptop(500, 2020, "Acer", "Windows 10");
        assertTrue(secondTestLaptop.getId() != testLaptop.getId());
    }

}