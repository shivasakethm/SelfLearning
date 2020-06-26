from typing import List


class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i = 0
        while i < len(nums):
            if nums[i] < target:
                i = i + 1
            elif nums[i] == target:
                return i
            else:
                break

        return i


if __name__ == '__main__':
    solution = Solution()
    lists = [1, 3, 5, 6]
    lists1 = [1, 3, 4, 6]
    val = 4
    res = solution.searchInsert(lists1, val)
    print(res)
