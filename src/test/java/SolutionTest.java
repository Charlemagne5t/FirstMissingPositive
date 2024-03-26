import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){
        long[] nums = {1,2,0};
        long expected = 3L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2(){
        long[] nums = {2,1};
        long expected = 3L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        long[] nums = {3,4,-1,1};
        long expected = 2L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        long[] nums = {1, 0};
        long expected = 2L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        long[] nums = {1,2,6,3,5,4};
        long expected = 7L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test6(){
        long[] nums = {-10,-3,-100,-1000,-239,1};
        long expected = 2L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test7(){
        long[] nums = {43,20,39,-7,-8,-2,8,17,10,17,12,6,37,17,50,44,3,11,18,-4,44,37,28,50,15,50,19,0,45,5,37,35,35,21,39,35,27,-8,-1,47,19,22,1,1,47,-4,-7,-3,16,21,2,7,6};
        long expected = 4L;
        long actual = new Solution().firstMissingPositive(nums);

        Assert.assertEquals(expected, actual);
    }

}
