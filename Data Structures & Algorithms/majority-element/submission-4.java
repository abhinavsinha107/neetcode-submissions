class Solution {
    public int majorityElement(int[] nums) {
        int currentElem = nums[0], count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(count == 0) currentElem = nums[i];
            count = nums[i] == currentElem ? count + 1 : count - 1;
        }
        return currentElem;
    }
}