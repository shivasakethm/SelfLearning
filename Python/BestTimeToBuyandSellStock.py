from typing import List


class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        # length = len(prices)
        # result = 0
        #
        # for i in range(0,length):
        #     for j in range(i+1, length):
        #         a = prices[i] - prices[j]
        #         if(a < result):
        #             result = a
        #
        # return -result
        min = prices[0]
        index = 0
        i = 1
        while (i < len(prices) - 1):
            if (prices[i] < min):
                min = prices[i]
                index = i
            i = i + 1

        max = 0
        while (index < len(prices)):
            if (prices[index] > max and prices[index] > min):
                max = prices[index]
            index = index + 1

        return max - min


if __name__ == '__main__':
    solution = Solution()
    print(solution.maxProfit([7, 6, 4, 3, 1]))
