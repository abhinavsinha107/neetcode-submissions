class Solution {
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public void sortColors(int[] nums) {
        int l = 0, r = nums.length-1, i = 0;
        while(i <= r) {
            if(nums[i] == 0) {
                swap(nums, l, i);
                l++;
            } else if(nums[i] == 2) {
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }
}