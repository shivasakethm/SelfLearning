from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:

        ##First Solution
        # i = 0
        # j = len(nums)
        # k = len(nums)
        # while i < k:
        #     if val in nums:
        #         nums.remove(val)
        #         j = j - 1
        #         i = i + 1
        #     else:
        #         i = i+1
        # return j

        ##Second Solution
        while True:
            try:
                nums.remove(val)
            except:
                break
        len(nums)


if __name__ == '__main__':
    solution = Solution()
    sortedarray = [3, 2, 2]
    val = 2
    solution.removeElement(sortedarray, val)
    print(sortedarray)
