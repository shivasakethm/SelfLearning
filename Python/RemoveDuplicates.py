from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:

        # First Solution
        i = 0;
        while i + 1 < len(nums):
            if nums[i] == nums[i + 1]:
                nums.remove(nums[i])
            else:
                i = i + 1

        ##Second Solution


if __name__ == '__main__':
    solution = Solution()
    sortedarray = [0, 1, 1, 1, 1, 1, 2, 2]
    solution.removeDuplicates(sortedarray)
    print(sortedarray)
