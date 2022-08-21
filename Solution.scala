object Solution {
    def containsDuplicate(nums: Array[Int]): Boolean = {
        for (i <- 0 until nums.length) {
            var value: Int = nums(i);
            for (j <- i+1 until nums.length) {
                if (value == nums(j)) return true;
            }
        }
        return false;
    }
}