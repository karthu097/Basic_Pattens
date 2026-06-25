package Day_9;

import java.util.HashMap;

public class TwoSumInArray {

    public static int[] twoSum(int[] nums, int target) {
        // HashMap to store the value as the key and its index as the value
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            // Otherwise, add the current number and its index to the map
            map.put(nums[i], i);
        }

        // Return empty array if no solution is found
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] ans = twoSum(nums, target);

        if (ans.length == 2) {
            System.out.println(ans[0] + " " + ans[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}