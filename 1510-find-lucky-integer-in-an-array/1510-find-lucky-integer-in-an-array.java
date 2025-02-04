class Solution {
    public int findLucky(int[] arr) {
        int count = 0, max = 0;
        Arrays.sort(arr);
        
        System.out.println();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!list.contains(arr[i]))
            {
                list.add(arr[i]);
            }
        }
        int[] a = new int[list.size()];
        for(int i=0;i<a.length;i++)
        {
            a[i] = list.get(i);
        }
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(a[i]==arr[j])
                {
                    count++;
                }
            }
            l.add(count);
        }
        int f[] = new int[l.size()];
        for(int i=0;i<f.length;i++)
        {
            f[i] = l.get(i);
        }
        Arrays.sort(f);
        System.out.println();
        for(int i=f.length-1;i>=0;i--)
        {
            System.out.print(f[i]+" ");
        }
        int count1=0;
        System.out.println();
        for(int i=f.length-1;i>=0;i--)
        {
            count1=0;
            for(int j=arr.length-1;j>=0;j--)
            {
                if(f[i]==arr[j])
                {
                    count1++;
                }
            }
            if(f[i]==count1)
            {
                return count1;
            }
        }
        return -1;
    }
}