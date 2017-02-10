class Solution(object):
    def addStrings(self, num1, num2):
        """
        :type num1: str
        :type num2: str
        :rtype: str
        """
        sum1 = 0
        sum2 = 0
        length1 = len(num1)
        length2 = len(num2)
        for i in range(length1):
            sum1 = sum1*10 + int(num1[i])
        for i in range(length2):
            sum2 = sum2*10 + int(num2[i])
        return str(sum1+sum2)
        