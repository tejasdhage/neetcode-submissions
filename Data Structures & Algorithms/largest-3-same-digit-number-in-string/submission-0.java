class Solution {
    public String largestGoodInteger(String num) {
        
        String maxGoodInt = "";
        for (int i = 0; i < num.length() - 2; i++) {

            if (isGoodInteger(num, i)) {
                char goodIntChar = num.charAt(i);
                if (maxGoodInt.length() == 0 || goodIntChar >= maxGoodInt.charAt(0)) {
                    maxGoodInt = "" + goodIntChar + goodIntChar + goodIntChar;
                }
            }
        }

        return maxGoodInt;
    }

    private boolean isGoodInteger(String num, int startIdx) {
        
        return num.charAt(startIdx) == num.charAt(startIdx + 1) &&
            num.charAt(startIdx) == num.charAt(startIdx + 2);
    }
}