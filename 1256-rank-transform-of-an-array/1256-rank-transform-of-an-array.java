class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] b = arr.clone();
        HashMap<Integer,Integer> map = new HashMap<>();
        int rank=1;
        Arrays.sort(b);
        for(int i:b)
        {
            if(!map.containsKey(i))
            {
                map.put(i,rank++);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}