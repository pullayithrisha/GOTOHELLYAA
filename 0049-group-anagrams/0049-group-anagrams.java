class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
       HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
             char arr[]=strs[i].toCharArray();
             Arrays.sort(arr);
             String ss=new String(arr);
             if(!hm.containsKey(ss))
             {
                hm.put(ss,new ArrayList<>());
             }
             hm.get(ss).add(strs[i]);
        }
        res.addAll(hm.values());
            return res;

    }
}