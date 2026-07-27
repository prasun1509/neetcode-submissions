//using frequency array

class Solution {
    public int majorityElement(int[] nums) {
        int max = nums[0];
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        int[] freq = new int[max+1];
        for(int num:nums){
            freq[num]++;
        }
        
        for(int i =0;i<freq.length;i++){
            if(freq[i]>nums.length/2){
                return i;
            }
        }
        return 0;
    }
}