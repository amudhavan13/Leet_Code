class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0,i=0;
        int[] a = new int[nums.size()];
        for(int num:nums)
        {
            a[i]=num;
            i++;
        }
        for(i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]<target)
                {
                    count++;
                }
            }
        }
        return count;
    }
}