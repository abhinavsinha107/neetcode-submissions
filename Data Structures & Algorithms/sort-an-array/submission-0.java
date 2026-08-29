class Solution {
    private void merge(int[] nums, int l, int mid, int r) {
        int[] temp = new int[r-l+1];
        int a = l, b = mid+1, c = 0;
        while(a <= mid && b <= r) {
            if(nums[a] <= nums[b]) {
                temp[c++] = nums[a++];
            } else {
                temp[c++] = nums[b++];
            }
        }
        while(a <= mid)
            temp[c++] = nums[a++];
        while(b <= r)
            temp[c++] = nums[b++];
        for(int i = l; i <= r; i++) {
            nums[i] = temp[i-l];
        }
    }

    private void mergeSort(int[] nums, int l , int r) {
        if(l >= r) return;
        int mid = l + (r-l)/2;
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r);
    }

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}