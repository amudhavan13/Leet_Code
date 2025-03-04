class Solution {
    public boolean detectCapitalUse(String word) {
        int ucount = 0, lcount=0;
        char[] cha = word.toCharArray();
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch))
            ucount++;
            else if(Character.isLowerCase(ch))
            lcount++;
        }
        if(lcount==word.length())
        {
        System.out.print(lcount);
        return true;
        }

        else if(ucount==word.length())
        {
        return true;
        }
        else if(Character.isUpperCase(cha[0])&&ucount==1)
        {
            return true;
        }
        else
        {
        return false;
        }


    }
}