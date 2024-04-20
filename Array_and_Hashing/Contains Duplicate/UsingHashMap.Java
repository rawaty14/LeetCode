class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer,Integer>hm=new HashMap<>();

        boolean result=false;

        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            hm.put(nums[i],hm.get(nums[i])+1);

            else
            hm.put(nums[i],1);
        }

        for(Map.Entry<Integer,Integer>em:hm.entrySet())
        {
                if(em.getValue()>1)
                {
                result=true;
                break;
                }
        }

        return result;



    }
}