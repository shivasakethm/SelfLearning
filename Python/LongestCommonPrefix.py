from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        var = 0
        if len(strs) >= 1 and len(strs[0]) > 0:
            for i in strs[0]:
                for j in strs[1:]:
                    try:
                        if j[var] != i:
                            return res
                    except Exception as e:
                        return res
                res = res + i
                var = var + 1
        return res


if __name__ == '__main__':
    solution = Solution()
    listOfWords = ["flower", "flow", "flight"]
    result = solution.longestCommonPrefix(listOfWords)
    print(result)
