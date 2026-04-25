class Solution {
    public int maxAscendingSum(int[] nums) {
        
        int maxSumEndingHere = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int currNum = nums[i];
            int prevNum = nums[i - 1];

            if (currNum > prevNum) {
                maxSumEndingHere += currNum;
            } else {
                maxSumEndingHere = currNum;
            }

            ans = Math.max(ans, maxSumEndingHere);
        }

        return ans;
    }
}