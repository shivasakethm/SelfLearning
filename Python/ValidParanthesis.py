class Solution:
    def isValid(self, s: str) -> bool:
        # result = []
        # dicts = {'(': ')', '{': '}', '[': ']'}
        # if len(s) == 0:
        #     return True
        # else:
        #     for paranthesis in s:
        #         print(paranthesis)
        #         try:
        #             if dicts[result[-1]] == paranthesis:
        #                 result.pop()
        #             else:
        #                 result.append(paranthesis)
        #         except:
        #             result.append(paranthesis)
        #     print(result)
        #     if len(result) == 0:
        #         return True
        #
        # return False
        stack = []

        # Hash map for keeping track of mappings. This keeps the code very clean.
        # Also makes adding more types of parenthesis easier
        mapping = {")": "(", "}": "{", "]": "["}

        # For every bracket in the expression.
        for char in s:

            # If the character is an closing bracket
            if char in mapping:

                # Pop the topmost element from the stack, if it is non empty
                # Otherwise assign a dummy value of '#' to the top_element variable
                top_element = stack.pop() if stack else '#'
                print(top_element, char, stack)

                # The mapping for the opening bracket in our hash and the top
                # element of the stack don't match, return False
                if mapping[char] != top_element:
                    return False
            else:
                # We have an opening bracket, simply push it onto the stack.
                stack.append(char)
                print(stack)

        # In the end, if the stack is empty, then we have a valid expression.
        # The stack won't be empty for cases like ((()
        return not stack


if __name__ == '__main__':
    solution = Solution()
    val = '()([]){}'
    print(solution.isValid(val))
