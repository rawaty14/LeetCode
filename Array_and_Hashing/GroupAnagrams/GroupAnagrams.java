class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            char[]arr=strs[i].toCharArray();

            Arrays.sort(arr);

            String s2=new String(arr);

            if(!map.containsKey(s2))

            map.put(s2,new ArrayList<String>());

            

            (map.get(s2)).add(strs[i]);
        }

        return new ArrayList<>(map.values());

        
        
    }
}