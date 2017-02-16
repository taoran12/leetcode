class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        l = 0
        r = len(nums) - 1
        if target <= nums[l]:
            return l
        elif target > nums[r]:
            return r+1
        elif target == nums[r]:
            return r
        while l <= r:
            m = (l + r)/2
            if nums[m] > target:
                r = m - 1
                if r >= 0:
                    if nums[r] < target:
                        return r+1
                else:
                    return 0
            elif nums[m] < target:
                l = m +1
                if l < len(nums):
                    if nums[l] > target:
                        return l
                else:
                    return len(nums)
            else:
                return m
            