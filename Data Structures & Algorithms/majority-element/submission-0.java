class Solution {
    public int majorityElement(int[] nums) {

        //count frequency of each element

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Map.Entry<Integer,Integer> maxEntry = null;
        
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(maxEntry==null || entry.getValue()>maxEntry.getValue()){
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
}