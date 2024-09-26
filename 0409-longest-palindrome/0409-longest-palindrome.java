class Solution {
    public int longestPalindrome(String s) {
               HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int length = 0;
        boolean oddFound = false;
        for (int count : freqMap.values()) {
            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                oddFound = true;
            }
        }
        if (oddFound) {
            length += 1;
        }

        return length;
    }
}