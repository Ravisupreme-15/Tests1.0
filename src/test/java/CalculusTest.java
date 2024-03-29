import org.example.Calculus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculusTest {

    @Test
    public void testAddition() {
        int result = Calculus.add(3, 5);
        Assert.assertEquals(result, 8);
    }

    @Test
    public void testSubtraction() {
        int result = Calculus.subtract(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testMultiply() {
        int result = Calculus.multiply(10, 5);
        Assert.assertEquals(result, 50);
    }

    @Test
    public void testDivision() {
        int result = Calculus.divide(10, 5);
        Assert.assertEquals(result, 2);
    }

    @Test
    public void testPower() {
        int result = Calculus.power(2, 2);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void testMax() {
        int result = Calculus.max(1, 2);
        Assert.assertEquals(result, 2);
    }

    
    @Test
    public void testMax2() {
        int result = Calculus.max(2, 3);
        Assert.assertEquals(result, 3);
    }

       @Test
    public void testMax3() {
        int result = Calculus.max(2, 4);
        Assert.assertEquals(result, 4);
    }






}
