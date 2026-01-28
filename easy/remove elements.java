/**
 * LeetCode Problem 27: Remove Element
 *
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in-place and return
 * the number of elements remaining.
 *
 * The order of elements may be changed.
 * Extra space is not allowed.
 */
class removeElement {

    public int removeElement(int[] nums, int val) {

        // Pointer to track position for next valid element
        int k = 0;

        // Traverse the entire array
        for (int i = 0; i < nums.length; i++) {

            // If current element is not equal to val
            if (nums[i] != val) {

                // Place it at index k
                nums[k] = nums[i];

                // Move k to the next position
                k++;
            }
        }

        // k represents the number of valid elements
        return k;
    }
}
