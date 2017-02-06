class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        num = 0
        m = 0
        for i in nums:
            if i == 1:
                num += 1
            else:
                num = 0
            m = max(num,m)
        return m