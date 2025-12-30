class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, counter = 0;

        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                counter += 1;
            }
            max = Math.max(counter,max);
            if(nums[i] == 0){
                counter = 0;
            }
        }
        return max;
    }
}