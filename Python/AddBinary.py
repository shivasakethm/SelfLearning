def decimalToBinary(self) -> str:
    result = ''
    while self > 0:
        rem = self % 2
        result = str(int(rem)) + result
        if rem == 0:
            self = int(self / 2)
            print(self, result, "if")
        else:
            self = int((self + 1) / 2) - 1
            print(self, result, "else")
    return result


def binarytoDecimal(self) -> int:
    returnResult = 0
    j = 0
    for i in range(len(self) - 1, -1, -1):
        digit = self[i]
        evaluate = pow(2, j) * int(digit)
        returnResult = returnResult + evaluate
        j = j + 1

    return returnResult


class Solution:

    def addBinary(self, a: str, b: str) -> str:
        if int(a) == 0 and int(b) == 0:
            return str(0)
        elif int(a) == 0:
            return b
        elif int(b) == 0:
            return a
        a1 = binarytoDecimal(a)
        b1 = binarytoDecimal(b)
        print(a1, b1)
        c = a1 + b1
        print(c)
        c1 = decimalToBinary(c)
        return c1


if __name__ == '__main__':
    x = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    y = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
    solution = Solution()
    answer = solution.addBinary(x, y)
    print(answer)
