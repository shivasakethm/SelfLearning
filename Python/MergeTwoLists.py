from typing import List


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: List, l2: List, m: int, n: int) -> List:
        # l3 = []
        # i = 0
        # j = 0
        # while i < len(l1) and j < len(l2):
        #     if l1[i] < l2[j]:
        #         l3.append(l1[i])
        #         i = i + 1
        #     elif l1[i] == l2[j]:
        #         l3.append(l1[i])
        #         l3.append(l2[j])
        #         i = i + 1
        #         j = j + 1
        #     else:
        #         l3.append(l2[j])
        #         j = j + 1
        # l3 = l3 + l2[j:] + l1[i:]
        # return l3

        m = m - 1
        n = n - 1
        for i in range(len(l1) - 1, -1, -1):
            print(i)
            if (n < 0):
                return

            if (m >= 0 and l1[m] > l2[n]):
                l1[i] = l1[m]
                m = m - 1
            else:
                l1[i] = l2[n]
                n = n - 1


if __name__ == '__main__':
    solution = Solution()
    l1 = [2, 0]
    l2 = [1]
    solution.mergeTwoLists(l1, l2, 1, 1)
    print(l1)
