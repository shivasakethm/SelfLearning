class Solution:
    def romanToInt(self, s: str) -> int:

        ####My Solution
        # totalvalue = 0
        # var = 0
        # while var < len(s):
        #     if s[var] == 'M':
        #         totalvalue = totalvalue + 1000
        #         var = var + 1
        #         continue
        #     if s[var] == 'D':
        #         totalvalue = totalvalue + 500
        #         var = var + 1
        #         continue
        #     if s[var] == 'C':
        #         try:
        #             if s[var] == 'C' and s[var + 1] == 'M':
        #                 totalvalue = totalvalue + 900
        #                 var = var + 2
        #                 continue
        #             elif s[var] == 'C' and s[var + 1] == 'D':
        #                 totalvalue = totalvalue + 400
        #                 var = var + 2
        #                 continue
        #             else:
        #                 totalvalue = totalvalue + 100
        #                 var = var + 1
        #                 continue
        #         except:
        #             totalvalue = totalvalue + 100
        #             var = var + 1
        #             continue
        #     if s[var] == 'L':
        #         totalvalue = totalvalue + 50
        #         var = var + 1
        #         continue
        #     if s[var] == 'X':
        #         try:
        #             if s[var] == 'X' and s[var + 1] == 'C':
        #                 totalvalue = totalvalue + 90
        #                 var = var + 2
        #                 continue
        #             elif s[var] == 'X' and s[var + 1] == 'L':
        #                 totalvalue = totalvalue + 40
        #                 var = var + 2
        #                 continue
        #             else:
        #                 totalvalue = totalvalue + 10
        #                 var = var + 1
        #                 continue
        #         except:
        #             totalvalue = totalvalue + 10
        #             var = var + 1
        #             continue
        #     if s[var] == 'V':
        #         totalvalue = totalvalue + 5
        #         var = var + 1
        #         continue
        #     if s[var] == 'I':
        #         try:
        #             if s[var] == 'I' and s[var + 1] == 'X':
        #                 totalvalue = totalvalue + 9
        #                 var = var + 2
        #                 continue
        #             elif s[var] == 'I' and s[var + 1] == 'V':
        #                 totalvalue = totalvalue + 4
        #                 var = var + 2
        #                 continue
        #             else:
        #                 totalvalue = totalvalue + 1
        #                 var = var + 1
        #                 continue
        #
        #         except:
        #             totalvalue = totalvalue + 1
        #             var = var + 1
        #             continue
        #
        # return totalvalue

        ##Leetcode
        dics = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        summ = 0
        t = 1001
        for x in s:
            i = dics[x]
            if i <= t:
                print("i  ", i, "   t   ", t)
                summ += i
                print("sum  ", summ)
            else:
                print("i  ", i, "   t   ", t)
                summ += (i - t) - t
                print("sum  ", summ)
            t = i
        return summ
    ##Another solution
    # return sum(S.count(r)*v for r,v in [('I',1),('V',5),('X',10),('L',50),('C',100),('D',500),('M',1000),('IV',-2),('IX',-2),('XL',-20),('XC',-20),('CD',-200),('CM',-200)])


if __name__ == '__main__':
    solution = Solution()
    res = solution.romanToInt("MMCDXXV")
    print(res)
