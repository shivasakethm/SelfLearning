class CheckUnique:
    def isunique(self, str) -> bool:
        if (len(str) > 128):
            return False
        char_array = [False for _ in range(128)]
        for i in str:
            val = ord(i)
            if (char_array[val]):
                return False
            char_array[val] = True
        return True


if __name__ == '__main__':
    checkunique = CheckUnique();
    string = "sakeths"
    result = checkunique.isunique(string)
    print(result)
