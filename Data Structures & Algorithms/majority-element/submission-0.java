class Solution {
    public int majorityElement(int[] nums) {
        int res = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == res) count++;
            if(nums[i] != res && count > 0) count--;
            if(count == 0) {
                res = nums[i];
                count++;
            }
        }
        return res;
    }
}