
// question : https://leetcode.com/problems/missing-number/
// date : 24-12-2025
class MissingNumber {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;

        int sumofarr = 0;
        
        for(int i = 0; i < n; i++){
            sumofarr += nums[i];
        }
        int sumtilln = (int)(n*(n+1))/2;
        return sumtilln - sumofarr;
    }
}