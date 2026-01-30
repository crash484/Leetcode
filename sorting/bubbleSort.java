class Solution {
    public int[] bubbleSort(int[] nums) {
        for(int i =0 ;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    swap(nums,j,i);
                }
            }
        }
                    return nums;

    }

    void swap(int[] arr, int i1,int i2){
        int temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
        return;
    }
}