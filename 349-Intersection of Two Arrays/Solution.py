class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        dict = {}
        result = []
        for i in range(len(nums1)):
            dict[nums1[i]] = 1
        for j in range(len(nums2)):
            if dict.has_key(nums2[j]):
                dict.pop(nums2[j])
                result.append(nums2[j])
        return result
                