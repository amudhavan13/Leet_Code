class Solution {
        public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] sortedScore = score.clone();
        Arrays.sort(sortedScore);
        HashMap<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int rank = n - i;
            if (rank == 1) {
                rankMap.put(sortedScore[i], "Gold Medal");
            } else if (rank == 2) {
                rankMap.put(sortedScore[i], "Silver Medal");
            } else if (rank == 3) {
                rankMap.put(sortedScore[i], "Bronze Medal");
            } else {
                rankMap.put(sortedScore[i], String.valueOf(rank));
            }
        }
        for (int i = 0; i < n; i++) {
            result[i] = rankMap.get(score[i]);
        }
        return result;
    }
}