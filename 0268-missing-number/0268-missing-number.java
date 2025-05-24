class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            l.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!l.contains(i))
            {
                return i;
            }
        }
        return 0;
    }
}