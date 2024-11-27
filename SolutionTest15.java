import org.junit.Assert;
import org.junit.Test;

public class SolutionTest15 {

    private Solution15 solution = new Solution15();

    @Test
    public void testCompareVersionEqual() {
        Assert.assertEquals(0, solution.compareVersion("1.01", "1.001"));
        Assert.assertEquals(0, solution.compareVersion("1.0", "1.0.0"));
        Assert.assertEquals(0, solution.compareVersion("1.0.0", "1.0.0.0"));
    }

    @Test
    public void testCompareVersionFirstGreater() {
        Assert.assertEquals(1, solution.compareVersion("1.2", "1.1"));
        Assert.assertEquals(1, solution.compareVersion("1.0.1", "1.0"));
        Assert.assertEquals(1, solution.compareVersion("2.0.0", "1.9.9"));
    }

    @Test
    public void testCompareVersionSecondGreater() {
        Assert.assertEquals(-1, solution.compareVersion("1.1", "1.2"));
        Assert.assertEquals(-1, solution.compareVersion("1.0", "1.0.1"));
        Assert.assertEquals(-1, solution.compareVersion("1.9.9", "2.0.0"));
    }

    @Test
    public void testCompareVersionDifferentLengths() {
        Assert.assertEquals(0, solution.compareVersion("1.0", "1"));
        Assert.assertEquals(-1, solution.compareVersion("1", "1.1"));
        Assert.assertEquals(1, solution.compareVersion("1.1", "1"));
    }

}