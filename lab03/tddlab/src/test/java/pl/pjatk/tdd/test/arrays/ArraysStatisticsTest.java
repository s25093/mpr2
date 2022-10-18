package pl.pjatk.tdd.test.arrays;

import org.junit.Assert;
import org.junit.Test;
import pl.pjatk.tdd.arrays.ArraysStatistics;

import static org.junit.Assert.assertEquals;

public class ArraysStatisticsTest {
    @Test
    public void maximumShouldBePositiveNumber(){
        assertEquals(1, ArraysStatistics.max(new int[]{-10,-5,1,-2,-13}));
    }

    @Test
    public void maximumShouldBeNegativeNumber(){
        assertEquals(-10, ArraysStatistics.max(new int[]{-20,-18,-11,-10,-15}));
    }

    @Test
    public void minimumShouldBePositive(){
        assertEquals(2, ArraysStatistics.min(new int[]{3,4,5,2,7,10}));
    }

    @Test
    public void minimumShouldBeNegative(){
        assertEquals(-99, ArraysStatistics.min(new int[]{-5,-50,75,-99,0}));
    }

    @Test
    public void avgTest1(){
        Assert.assertEquals(3.8, ArraysStatistics.avg(new int[]{1,2,3,9,4}), 0.01);
    }

    @Test
    public void sumShouldBe100(){
        Assert.assertEquals(100, ArraysStatistics.sum(new int[]{10,20,30,40}));
    }

    @Test
    public void sumShouldBeMinus100(){
        Assert.assertEquals(-100, ArraysStatistics.sum(new int[]{-10,-20,-30,-40}));
    }
}
