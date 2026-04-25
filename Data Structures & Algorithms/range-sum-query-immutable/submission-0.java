class NumArray {

    private int[] prefixSum;

    public NumArray(int[] nums) {
        int n = nums.length;

        prefixSum = new int[n];
        prefixSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = nums[i] + prefixSum[i - 1];
        }
    }
    
    public int sumRange(int left, int right) {
        int leftVal = 0;
        if (left - 1 >= 0) {
            leftVal = prefixSum[left - 1];
        }
        return prefixSum[right] - leftVal;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */