class Solution {
    public int[] threeEqualParts(int[] arr) {
        int oneSum = 0;
        for(int x : arr) oneSum +=x;
        if(oneSum % 3 !=0)return new int[]{-1,-1};
        if(oneSum == 0)return new int[]{0,2};
        int oneCount = oneSum / 3;
        int i = 0;
        int firstOne = -1;
        int n= arr.length;
        int lastZeroCount = 0;
        i = n-1;
        while(arr[i] ==0){
            lastZeroCount++;
            i--;
        }
        i=0;
        while(oneCount > 0){
            if(arr[i] == 1 && firstOne == -1)firstOne = i;
            oneCount-=arr[i++];
        }
        while(lastZeroCount > 0){
            if(arr[i++] == 1)return new int[]{-1,-1};
            lastZeroCount--;
        }
        int k = i--;
        int t = firstOne;
        while(arr[k] == 0)k++;
        while(firstOne <=i){
            if(arr[firstOne++] != arr[k++])return new int[]{-1,-1};
        }
        int j = k;
        while(arr[k] == 0)k++;
        firstOne = t;
         while(firstOne <=i){
            if(arr[firstOne++] != arr[k++])return new int[]{-1,-1};
        }
        return new int[]{i,j};
    }
}