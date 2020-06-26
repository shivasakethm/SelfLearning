from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        ##First Solution
        # for i in range(0, len(nums)):
        #     findElement = target - nums[i]
        #     if findElement in nums[i+1:]:
        #         return [i, nums.index(findElement, i+1, len(nums))]

        ##Second Solution
        # i = 0
        # while i <= len(lists):
        #     findElement = target - nums[i]
        #     j = i+1
        #     while j < len(lists):
        #         if(nums[j] == findElement):
        #             return [i,j]
        #         else:
        #             j = j+1
        #     i = i+1

        ##Third Solution
        # i = 0
        # length = len(lists)
        # while i <= len(lists):
        #     findElement = target - nums[i]
        #     if findElement in nums[i + 1:]:
        #         return [i, nums.index(findElement, i + 1, length)]
        #     i = i + 1

        ##Leetcode Solution
        my_dict = {}
        for i in range(0, len(nums)):
            findElement = target - nums[i]
            if findElement in my_dict.keys() and my_dict[findElement] != i:
                return [my_dict[findElement], i]
            my_dict[nums[i]] = i


if __name__ == '__main__':
    lists = [3, 2, 4]
    targets = 6
    sol = Solution.twoSum(0, lists, targets)
    print(sol)
