
import static java.util.Arrays.sort;

public class Homework1_Task2 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] expectedNums = nums;
        int k = removeElement(nums, val);
        assert k == expectedNums.length;
        sort(nums, 0, k);
        for (int i = 0; i < expectedNums.length; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[count] = nums[i];
            count++;
        }
        return count;
    }
}
