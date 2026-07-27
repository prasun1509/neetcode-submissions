 //using boyre moore voting algorithm
class Solution {
    public int majorityElement(int[] nums) {
     int majority = nums[0];
     int votes = 1;
     for(int num:nums){
        if(votes==0){
            votes++;
            majority=num;
        }
        if(majority == num){
            votes++;
        }
        else {
            votes--;
        }

     }

return majority;
    }
}