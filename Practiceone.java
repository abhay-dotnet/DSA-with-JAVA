import java.util.HashMap;
import java.util.Arrays;

class Practiceone {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // Find the number required to reach the target
            int need = target - nums[i];

            // If required number is already present
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            // Store number and its index
            map.put(nums[i], i);
        }

        // No valid pair found
        return new int[]{};
    }

    public static void main(String[] args) {

        Practiceone obj = new Practiceone();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;

        // Get results
        int[] result1 = obj.twoSum(nums1, target1);
        int[] result2 = obj.twoSum(nums2, target2);
        int[] result3 = obj.twoSum(nums3, target3);

        // Print results
        System.out.println("Example 1 Output: " + Arrays.toString(result1));
        System.out.println("Example 2 Output: " + Arrays.toString(result2));
        System.out.println("Example 3 Output: " + Arrays.toString(result3));
    }
}