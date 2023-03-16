import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] test = new int[]{-4,-3,-2,-1,0,1,2,3,4};
        int target = 0;
        int expected = 4;

        Assertions.assertEquals(expected, solution.search(test, target));
    }

    @Test
    public void testCase2() {
        int[] test = new int[]{};
        int target = 2;
        int expected = -1;

        Assertions.assertEquals(expected, solution.search(test, target));
    }

    @Test
    public void testCase3() {
        int[] test = new int[]{-3,-2,-1};
        int target = 2;
        int expected = -1;

        Assertions.assertEquals(expected, solution.search(test, target));
    }

    @Test
    public void testCase4() {
        int[] test = new int[]{-3,-2,-1};
        int target = 2;
        int expected = -1;

        Assertions.assertEquals(expected, solution.search(test, target));
    }
}
