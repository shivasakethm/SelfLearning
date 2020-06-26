word = "racecarz"
#
# dictword = {}
#
# result = 0
# for i in word:
#     if i in dictword.keys():
#         a = dictword[i]
#         a = a + 1
#         dictword[i] = a
#     else:
#         dictword[i] = 1
#
# for i in dictword:
#     if(dictword[i] % 2 !=0):
#         result = result + 1
#
# print(dictword)
# print(result)

# res = 0
# for i in word:
#     s = 0
#     s = word.count(i)
#     if(s%2!=0):
#         res = res + 1
#
# print(res)
# if(res > 1):
#     print(-1)

# lists = [1,7,3,6,5,6]
#
# for i in range(1,len(lists)-1):
#     if sum(lists[0:i]) == sum(lists[i + 1:]):
#         print(i)
#         break

#
# n = 1000000
# steps = 0
# while(n != 1):
#     if(n%3 == 0):
#         n = n/3
#         steps = steps + 1
#         print(int(n), end="->")
#     elif(n%3 == 1):
#         n = n - 1
#         steps = steps + 1
#         print(int(n), end="->")
#     elif(n%2 == 0):
#         n = n/2
#         steps = steps + 1
#         print(int(n), end="->")
#     else:
#         n = n -1
#         steps = steps + 1
#         print(int(n), end="->")
# print(steps)
#
#
# n = 100
# steps = 0
# flag = 0
# while(n != 1):
#     if(n%3 == 0):
#         n = n/3
#         steps = steps + 1
#         print(int(n), end="->")
#     elif(n%3 == 1):
#         n = n - 1
#         steps = steps + 1
#         print(int(n), end="->")
#     elif(n%2 == 0):
#         n = n/2
#         steps = steps + 1
#         print(int(n), end="->")
#     else:
#         n = n -1
#         steps = steps + 1
#         print(int(n), end="->")
# print(steps)
#
# returnResult = 0
# j = 0
# string = '100'
# for i in range(len(string) -1, -1, -1):
#     digit = string[i]
#     print(digit)
#     evaluate = pow(2, j)*int(digit)
#     returnResult = returnResult + evaluate
#     j = j + 1
# print(returnResult)
#
# 24847893154024981730169397005
# "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101" 24847893154024981730169397005
# "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011" 526700554598729746900966573811
# from functools import reduce
# res = [1,0,1]
# sres = str(reduce(lambda x, y: 10 * x + y, res))
# print(sres)
#
# print(int('100',2))

nums = [-1, 1, 0, 1, 2, 4]
sorted(nums)
seen = {nums[0]: 1}
print(seen[-1])
if (-1 in seen):
    print("saketh")
    nums.pop()
sorted(any(t))
