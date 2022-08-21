def containsDuplicate(nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        s = set(nums)
        if len(s) == len(nums):
            return False
        return True