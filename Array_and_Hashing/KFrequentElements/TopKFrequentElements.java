class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
      List<Integer>[]bucket=new ArrayList[nums.length+1];

      Map<Integer,Integer>hm=new HashMap<>();

      for(int i=0;i<nums.length;i++)
      {
        if(hm.containsKey(nums[i]))
        hm.put(nums[i],hm.get(nums[i])+1);

        else

        hm.put(nums[i],1);
      }

      for(int key:hm.keySet())
      { 
        if(bucket[hm.get(key)]==null)
        bucket[hm.get(key)]=new ArrayList<Integer>();

        bucket[hm.get(key)].add(key);
      }

       
        
        
       
        List<Integer>al1=new ArrayList<Integer>();
       for(int i=bucket.length-1;i>=1;i--)
       {        
            
            if(bucket[i]!=null)
            {   
            
                for(int j=0;j<bucket[i].size();j++)
                {
                  
                    al1.add(bucket[i].get(j));

                  
                    
                }

                  if(al1.size()>=k)
                    break;
            }

             
       }
       int[]ans=new int[al1.size()];

             for(int p=0;p<al1.size();p++)
             {
                ans[p]=al1.get(p);
             }

       return ans;
    }
}