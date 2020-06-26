class Solution:
    def IsPalindrome(self, x: int) -> bool:
        ##Math Solution
        # original: int = x
        # if x < 0:
        #     return False
        # else:
        #     rev = 0
        #     while x > 0:
        #         rem = x%10
        #         rev = rev*10 + rem
        #         x = int(x/10)
        # return original == rev

        ##using string methods
        return False if x < 0 else x == int(str(x)[::-1])


if __name__ == '__main__':
    solution = Solution()
    sol = solution.IsPalindrome(121)
    print(sol)
