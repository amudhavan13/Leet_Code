class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s = new HashSet();
        for(int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        List<Integer> l = new ArrayList<Integer>(s);
        int count = 0;
        Collections.sort(l);
        //System.out.print(l);
        for(int i:l)
        {
            count = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    
                    count++;
                   
                }
            }
             
            if(count==1)
            {
                return i;
            }
            
        }
        return 0;
    }
}