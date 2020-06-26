class Solution:
    def reverse(self, x: int) -> int:
        original: int = x
        neg = abs(x)
        if x < 0:
            rev = 0
            while neg > 0:
                rem = neg % 10
                rev = rev * 10 + rem
                neg = int(neg / 10)
            if -rev < pow(-2, 31):
                return 0
            else:
                return -rev
        else:
            rev = 0
            while x > 0:
                rem = x % 10
                rev = rev * 10 + rem
                x = int(x / 10)
        if rev > pow(2, 31):
            return 0
        else:
            return rev


if __name__ == '__main__':
    reversenumber = Solution()
    val = 1534236469
    sol = reversenumber.reverse(val)
    print(sol)
