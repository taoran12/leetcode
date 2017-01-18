public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int num = 0;
        int max = 0;
        for(int n:nums){
            if (n == 1){
                num++;
            }else{
                num = 0;
            }
            max = Math.max(max,num);
        }
        return max;
    }
}