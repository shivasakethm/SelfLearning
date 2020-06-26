class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        # s=s.strip()
        # l = s.split()
        # print(l)
        # return len(l[-1])
        i = 0
        res = 0
        lres = 0
        while i < len(s):
            if s[i] != ' ':
                res = res + 1
            else:
                lres = max(lres, res)
                res = 0
            i = i + 1
        lres = max(lres, res)
        return lres


if __name__ == '__main__':
    solution = Solution()
    result = solution.lengthOfLastWord("b   a    ")
    print(result)
