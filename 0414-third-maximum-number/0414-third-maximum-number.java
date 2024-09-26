class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int max[] =  new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            max[i]=list.get(i);
        }
        int n=max.length;
        if(n>=3)
        {
            return max[n-3];
        }
        else
        {
           return max[n-1];
        }
    }
}