class Solution {
    public int[] productExceptSelf(int[] nums) {

          int[]nums1=new int[nums.length];
          int p=1;
          int q=1;
            
          for(int i=0;i<nums.length;i++)
          { 

            
            if(i==0)
        {
            nums1[i]=1;
        }
            else
        {
            p=p*nums[i-1];

            nums1[i]=p;

        }

          }

        for(int i=nums.length-1;i>=0;i--)
        {
           

            if(i==nums.length-1)
            {
                nums1[i]=nums1[i]*1;
            }

            else
            {
                q=q*nums[i+1];
                nums1[i]=nums1[i]*q;
            }
        }

        return nums1;

    }

    
}
