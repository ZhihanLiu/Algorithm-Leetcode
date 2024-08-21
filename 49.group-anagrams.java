/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for(String s : strs){
            map.computeIfAbsent(helper(s), k->new ArrayList<String>()).add(s);
        }
        for(ArrayList<String> l : map.values()) ans.add(l);

        return ans;

    }

    public String helper(String s){
        int[] count = new int[26];
        for(char c : s.toCharArray())
           count[c - 'a']+= 1;
        String key ="";
        for(int i =0; i < 26; i++) if(count[i]>0) key += i+"_"+count[i];
        return key;
    }
}
// @lc code=end

