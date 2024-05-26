import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testJobScheduling_singleJob() {
        Solution solution = new Solution();
        int[] startTime = {1};
        int[] endTime = {2};
        int[] profit = {50};

        int result = solution.jobScheduling(startTime, endTime, profit);
        assertEquals(50, result);
    }

    @Test
    public void testJobScheduling_multipleJobs() {
        Solution solution = new Solution();
        int[] startTime = {1, 2, 3, 4};
        int[] endTime = {3, 5, 10, 6};
        int[] profit = {50, 10, 40, 70};

        int result = solution.jobScheduling(startTime, endTime, profit);
        assertEquals(120, result);
    }

    @Test
    public void testJobScheduling_overlappingJobs() {
        Solution solution = new Solution();
        int[] startTime = {1, 1, 1};
        int[] endTime = {2, 3, 4};
        int[] profit = {5, 6, 4};

        int result = solution.jobScheduling(startTime, endTime, profit);
        assertEquals(6, result);
    }

    @Test
    public void testJobScheduling_nonOverlappingJobs() {
        Solution solution = new Solution();
        int[] startTime = {1, 2, 3, 4, 6};
        int[] endTime = {3, 5, 10, 6, 9};
        int[] profit = {20, 20, 100, 70, 60};

        int result = solution.jobScheduling(startTime, endTime, profit);
        assertEquals(150, result);
    }

    @Test
    public void testJobScheduling_noJobs() {
        Solution solution = new Solution();
        int[] startTime = {};
        int[] endTime = {};
        int[] profit = {};

        int result = solution.jobScheduling(startTime, endTime, profit);
        assertEquals(0, result);
    }
}
