import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCases {
    Solution solution = new Solution();

    @Test
    public void testCase1() {
        int[] test = new int[]{-1,0,3,5,9,12};
        int target = 9;
        int expected = 4;

        Assertions.assertEquals(expected, solution.search(test, target));
    }
}
