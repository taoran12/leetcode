public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int len = nums.length;
        sum = (0+len)*(1+len)/2;
        for (int num:nums){
            sum -= num;
        }
        return sum;
    }
}