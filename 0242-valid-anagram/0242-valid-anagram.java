class Solution {
    public boolean isAnagram(String s, String t) {
     /* if(s.length()!=t.length())
      return false;
      ArrayList<Integer> l = new ArrayList<>();
      for(int i=0;i<s.length();i++)
      {
        char ch = s.charAt(i);
        for(int j=0;j<t.length();j++)
        {
            char ch1 = t.charAt(j);
            if(ch==ch1)
            {
                if(l.contains(j))
                continue;
                else
                {
                    l.add(j);
                    break;
                }
            }
        }
      }  
      if(l.size()==s.length())
        return true;
        else
        return false;
    }*/
        if (s == null || t == null) return s == t;
        if (s.length() != t.length()) return false;
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int c : counts) if (c != 0) return false;
        return true;
    
}

}