from typing import List


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        ## this is using two loops
        # try:
        #     sum1 = nums[0]
        # except:
        #     sum1 = 0
        #
        # for i in range(0,len(nums)):
        #     for j in range(i,len(nums)):
        #         dummy = nums[i:j + 1]
        #         if(sum(dummy) > sum1):
        #             sum1 = sum(dummy)

        ##Another Leetcode
        # for i in range(1,len(nums)):
        # nums[i] = max(nums[i-1]+nums[i],nums[i])
        # return max(nums)

        ## this is using one loop
        maximum = 0
        loopmax = 0
        for num in nums:
            loopmax = loopmax + num
            if (loopmax < num):
                loopmax = num

            if (loopmax > maximum):
                maximum = loopmax

        return maximum


if __name__ == '__main__':
    sol = Solution()
    result = sol.maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])
    print(sum([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
    print(result)
