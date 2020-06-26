from typing import List


class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        result = []
        for i in range(0, numRows):
            internalResult = []
            for j in range(0, i + 1):
                if j == 0:
                    internalResult.append(1)
                    continue
                if j == i:
                    internalResult.append(1)
                    continue
                internalResult.append(previousList[j] + previousList[j - 1])
            previousList = internalResult
            result.append(internalResult)
        return result


if __name__ == '__main__':
    solution = Solution()
    res = solution.generate(5)
    print(res)
