class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i = 0, k = nums.length - 1;
        
        while (i <= k) {
            int currNum = nums[i];

            if (currNum == val) {
                swap(nums, i, k);
                k--;
            } else {
                i++;
            }
        }

        return k + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}