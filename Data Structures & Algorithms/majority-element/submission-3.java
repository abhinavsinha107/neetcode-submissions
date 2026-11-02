class Solution {
    public int majorityElement(int[] nums) {
        int currentElem = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == currentElem) {
                count++;
            } else {
                if(count > 0) count--;
                else {
                    currentElem = nums[i];
                    count = 1;
                }
            }
        }
        return currentElem;
    }
}