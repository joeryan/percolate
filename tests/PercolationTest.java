import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Percolation}.
 *
 * @author joe@clanryan.us Joe Ryan
 */
public class PercolationTest {
    @Test
    public void testPercolationConstructor() {
        Percolation percolator = new Percolation(4);
        percolator.open(3,3);
        assertEquals(percolator.isOpen(3,3), true);
        assertEquals(percolator.isOpen(2,3), false);
    }
    

    @Test
    public void testPercolationOpen() {
        Percolation percolator = new Percolation(1);
        percolator.open(1,1);
        assertEquals(percolator.isOpen(1,1), true);
    }
    
    @Test
    public void testPercolation_isFull() {
        Percolation percolator = new Percolation(1);
        assertEquals(percolator.isFull(1,1), true);
    }
    
    @Test
    public void testPercolation_percolates() {
        Percolation percolator = new Percolation(1);
        assertEquals(percolator.percolates(), true);
    }
    
        
}