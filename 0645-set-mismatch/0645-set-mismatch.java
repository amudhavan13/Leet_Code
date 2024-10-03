class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] a = new int[2];
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                a[j] = nums[i];
                j++;
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        for(int i=1;i<=n;i++)
        {
            if(!set.contains(i))
            {
                a[j]=i;
                
            }
        }
        return a;
        
    }
}