class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if len(haystack) < len(needle):
            return -1
        mainString = len(haystack)
        subString = len(needle)
        i = 0
        while i < mainString - subString + 1:
            if haystack[i:i + subString] == needle:
                return i
            i = i + 1

        return -1


if __name__ == '__main__':
    solution = Solution()
    result = solution.strStr('hello', 'll')
    print(result)
