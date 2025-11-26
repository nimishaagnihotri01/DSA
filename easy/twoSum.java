class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // if no solution found
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);
        if(result.length == 2) {
            System.out.println("Index 1: " + result[0]);
            System.out.println("Index 2: " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }
}
