class Solution {
    public int partitionDisjoint(int[] A) {
        int[] lmax=new int[A.length]; //lmax :left maximum
        int[] rmin=new int[A.length]; //rmin : right minimum
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i]);
            lmax[i]=max;
        }
        
        int min=Integer.MAX_VALUE;
        for(int i=A.length-1;i>=0;i--){
            min=Math.min(min,A[i]);
            rmin[i]=min;
        }
        
        for(int i=1;i<A.length;i++){
            if(lmax[i-1]<=rmin[i]) return i;
        }
        return A.length;
    }
}