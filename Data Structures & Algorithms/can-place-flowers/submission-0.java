class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for (int i = 0; i < flowerbed.length && n > 0; i++) {

            int currVal = flowerbed[i];
            
            int prevVal = 0;
            if (i - 1 >= 0) {
                prevVal = flowerbed[i - 1];
            }

            int nextVal = 0;
            if (i + 1 < flowerbed.length) {
                nextVal = flowerbed[i + 1];
            }

            if (currVal == 0 && prevVal == 0 && nextVal == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }

        return n == 0;
    }
}