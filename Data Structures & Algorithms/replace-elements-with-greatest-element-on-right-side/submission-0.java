class Solution {
    public int[] replaceElements(int[] arr) {
        
        int n = arr.length;
        int[] ans = new int[n];
        int maxRight = -1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = maxRight;

            int currNum = arr[i];
            if (currNum > maxRight) {
                maxRight = currNum;
            }
        }

        return ans;
    }
}