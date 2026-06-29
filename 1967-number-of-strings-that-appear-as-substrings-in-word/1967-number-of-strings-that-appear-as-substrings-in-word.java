class Solution {
    public boolean isSubstring(String s,String t)
    {
        if(s.isEmpty()) return true;
        if(s.length()>t.length()) return false;
        return t.contains(s);
    }
    public int numOfStrings(String[] patterns, String word) {
        int res=0;
        for(int i=0;i<patterns.length;i++)
        {
            if(isSubstring(patterns[i],word))
            {
                res++;
            }
        }
        return res;
    }
}