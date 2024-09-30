/*
 * @lc app=leetcode id=140 lang=java
 *
 * [140] Word Break II
 */

// @lc code=start
class Solution {
    List<String> ans = new ArrayList<String>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        dfs(new StringBuilder(), new StringBuilder(), s,wordDict,0 );
        return ans;
    }
    public void dfs(StringBuilder sb, StringBuilder sb2, String s, List<String> wd, int index){
        if(sb.toString().equals(s)){
             ans.add(sb2.toString().substring(0, sb2.length() -1));
             return;
        }
        for(int i = index; i < s.length(); i++){
            String cur = s.substring(index, i +1 );
             if(wd.contains(cur)){
                    sb.append(cur);
                    sb2.append(cur);
                    sb2.append(" ");
                    dfs(sb,sb2,s,wd,i+1);
                    sb.delete(sb.length()-cur.length(), sb.length());
                    sb2.delete(sb2.length()-cur.length() - 1, sb2.length());
                 

             }
        }
    }
}
// @lc code=end

