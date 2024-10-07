class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int n = tem.length;
        int[] a = new int[n];
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (tem[i] >= c) {
                c = tem[i];
                a[i] = 0;
            } else {
                int d = 1;
                while (tem[i] >= tem[i + d]) {
                    d += a[i + d];
                }
                a[i] = d;
            }
        }
        
        return a;
    }
}
