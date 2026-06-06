class Solution {
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int i;
        for(i=0;i<(2*nums.length);i++){
            if(i<nums.length){
                ans[i] = nums[i];
            }
            else ans[i] = nums[i%nums.length];
        }
        return ans;
    }
    public static void main(String[] args){
        int[] nums = {1,4,1,2};
        
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}