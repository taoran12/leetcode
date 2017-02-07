public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();
        
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for (int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                intersect.add(nums2[j]);
            }
        }
        int[] result = new int[intersect.size()];
        int i = 0;
        for (int num:intersect){
            result[i++] = num;
        }
        return result;
    }
}