class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                list.add(i);
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==target)
            {
                list.add(i);
                break;
            }
        }
        if(list.isEmpty())
        {
            list.add(-1);
            list.add(-1);
        }
        int n[] = new int[list.size()];
        for(int i=0;i<n.length;i++)
        {
            n[i] = list.get(i);
        }
        return n;
    }
}