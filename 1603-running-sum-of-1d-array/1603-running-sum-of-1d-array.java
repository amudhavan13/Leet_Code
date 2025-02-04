class Solution {
    public int[] runningSum(int[] nums) {
       List<Integer> list = new ArrayList<>();
       int sum=0;
       for(int i=0;i<nums.length;i++) 
       {
        sum=sum+nums[i];
        list.add(sum);
        
       }
       System.out.print(list);
       int a[] = new int[list.size()];
       for(int i=0;i<list.size();i++)
       {
        a[i] = list.get(i);
       }
       return a;
    }
}