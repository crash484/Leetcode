class Solution {
    public int[] insertionSort(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else {
                    break;
                }
            }
        }
        return nums;
    }

    void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}