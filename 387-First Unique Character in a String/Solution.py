class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        d = {}
        for i in range(len(s)):
            c = s[i]
            d[c] = d.get(c,0) + 1
        for i in range(len(s)):
            c = s[i]
            if d[c] == 1:
                return i
        return -1