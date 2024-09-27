class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] a = new int[nums.length];
        int k=0;
        for(int i=0,j=nums.length-1;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                a[k]=nums[i];
                k++;
            }
            else
            {
                a[j]=nums[i];
                j--;
            }
        }
        
        return a;
    }
}