class Solution {
    public int missingNumber(int[] nums) {
        int largestValue = nums.length;
        int missing = 0;
        for (int i = 0; i < nums.length; i++) {
            missing += (largestValue - i) - nums[i];
        }
        return missing;
    }
}
