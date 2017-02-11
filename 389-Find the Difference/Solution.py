class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        res = set(t) - set(s)
        if(res):
            return list(res)[0]
        else:
            dict1 = {}
            for char in t:
                dict1[char] = dict1.get(char,0) + 1
            dict2 = {}
            for char in s:
                dict2[char] = dict2.get(char,0) + 1
            for i in dict1.keys():
                if dict1[i] != dict2[i]:
                    return i