class MaxSubArray {

    public int maxSubArray(int[] nums) {
        // Edge case: if nums is empty
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int sum = nums[0]; // Initialize sum with the first element
        int max = nums[0]; // Initialize max with the first element

        for (int i = 1; i < nums.length; i++) {
            // Update the sum to be either the current number or the sum of the previous subarray plus the current number
            sum = Math.max(nums[i], sum + nums[i]);
            // Update the maximum subarray sum found so far
            max = Math.max(max, sum);
        }

        return max;
    }

}
