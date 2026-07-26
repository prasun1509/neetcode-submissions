class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0||strs==null){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            int[] frequency = new int[26];
            for(char c:s.toCharArray()){
                frequency[c-'a']++;
            }
            
            StringBuilder freqString = new StringBuilder("");
            char c = 'a';
            for(int i:frequency){
                freqString.append(c);
                freqString.append(i);

            }
            String key = freqString.toString();
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
