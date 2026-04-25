class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] postfixSum = new int[n];

        prefixSum[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int currNum = nums[i];

            prefixSum[i] = prefixSum[i - 1] + currNum;
        }

        postfixSum[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int currNum = nums[i];

            postfixSum[i] = postfixSum[i + 1] + currNum;
        }

        for (int i = 0; i < nums.length; i++) {

            int leftSum = i - 1 >= 0 ? prefixSum[i - 1] : 0;
            int rightSum = i + 1 < n ? postfixSum[i + 1] : 0;

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}