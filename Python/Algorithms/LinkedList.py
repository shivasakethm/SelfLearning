class Node:
    def __init__(self, val):
        self.val = val
        self.next = None


class SLinkedList:
    class Node:
        def __init__(self, val):
            self.val = val
            self.next = None

    def __init__(self):
        self.head = None

    def print_LinkedList(self):
        traverseNode = self.head
        if traverseNode is None:
            print("List is empty")
        while traverseNode is not None:
            print(traverseNode.val, end=" ")
            traverseNode = traverseNode.next
        print()

    def atBeginning(self, newNodeval):
        NewNode = Node(newNodeval)
        NewNode.next = self.head
        self.head = NewNode

    def atEnd(self, newNodeval):
        NewNode = Node(newNodeval)
        if self.head is None:
            self.head = NewNode
            return
        traverseNode = self.head
        while traverseNode.next is not None:
            traverseNode = traverseNode.next
        traverseNode.next = NewNode

    def twoDataNodes(self, leftNodeval, newNodeval):
        NewNode = Node(newNodeval)
        traverseNode = self.head
        while (traverseNode.val != leftNodeval):
            traverseNode = traverseNode.next
        NewNode.next = traverseNode.next
        traverseNode.next = NewNode

    def removeNode(self, removeNodeval):
        traverseNode = self.head
        if traverseNode is None:
            print("There is no node present")

        if traverseNode is not None:
            if traverseNode.val == removeNodeval:
                self.head = traverseNode.next
                return

        while traverseNode is not None:
            if traverseNode.val == removeNodeval:
                break
            previousNode = traverseNode
            traverseNode = traverseNode.next
        previousNode.next = traverseNode.next

    def mergeLinkedList(self, list2):
        ResultLinkedList = SLinkedList()
        FirstParser = self.head
        SecondParser = list2.head
        if FirstParser is None:
            return list2
        if list2.head is None:
            return self
        if FirstParser.val < SecondParser.val:
            print("First list value less than second list")
            ResultLinkedList = self
            FirstParser = FirstParser.next
        else:
            print("Second list value less than first list")
            ResultLinkedList = list2
            SecondParser = SecondParser.next
        traverse = ResultLinkedList.head
        while FirstParser is not None and SecondParser is not None:
            if FirstParser.val < SecondParser.val:
                traverse.next = FirstParser
                traverse = traverse.next
                FirstParser = FirstParser.next
            else:
                traverse.next = SecondParser
                traverse = traverse.next
                SecondParser = SecondParser.next
        if FirstParser is None:
            traverse.next = SecondParser
        else:
            traverse.next = FirstParser

        return ResultLinkedList


if __name__ == '__main__':
    class link:
        def __init__(self):
            print("Calling link")

        def adding(self):
            print("adding")


    LinkedList1 = SLinkedList()
    LinkedList1.atEnd(0)
    LinkedList1.atEnd(6)
    LinkedList1.atEnd(8)
    LinkedList1.atEnd(10)
    LinkedList1.atEnd(11)
    LinkedList1.atEnd(13)
    LinkedList1.atEnd(14)
    LinkedList1.print_LinkedList()
    print("------------------------")
    LinkedList2 = SLinkedList()
    LinkedList2.atEnd(1)
    LinkedList2.atEnd(6)
    LinkedList2.atEnd(7)
    LinkedList2.atEnd(8)
    LinkedList2.atEnd(9)
    LinkedList2.atEnd(14)
    LinkedList2.print_LinkedList()
    result = LinkedList1.mergeLinkedList(LinkedList2)
    result.print_LinkedList()
    LinkedList1.print_LinkedList()
    LinkedList2.print_LinkedList()
