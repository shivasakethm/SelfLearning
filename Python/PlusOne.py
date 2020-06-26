from typing import List


class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        integer = ''
        for num in digits:
            integer = integer + str(num)
        integer = str(int(integer) + 1)
        result = []
        for i in integer:
            result.append(int(i))
        return result


if __name__ == '__main__':
    sol = Solution();
    res = sol.plusOne([9])
    print(res)
