class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int j=0,k=nums.length-1;
        int[] res = new int[n];
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                res[j]=nums[i];
                j++;
            }
            else
            {
                res[k] = nums[i];
                k--;
            }
        }
        return res;
    }
}