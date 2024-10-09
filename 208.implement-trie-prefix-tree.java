/*
 * @lc app=leetcode id=208 lang=java
 *
 * [208] Implement Trie (Prefix Tree)
 */

// @lc code=start
class Node{
    Character cur;
    HashMap<Character, Node> children;
    boolean isWord;
    public Node(char c){
        this.cur = c;
        this.children = new HashMap<>();
        this.isWord= false;
    }
}
class Trie {
    Node root;
    public Trie() {
        this.root = new Node(' ');
    }
    
    public void insert(String word) {
        Node tmp = root;
        for(char c : word.toCharArray()){
            tmp.children.putIfAbsent(c, new Node(c));
            tmp = tmp.children.get(c);    
        }
        tmp.isWord = true;
    }
    
    public boolean search(String word) {
        Node tmp = root;
        for(char c : word.toCharArray()){
            if(!tmp.children.containsKey(c))   return false;
            tmp = tmp.children.get(c);  
        }
        return tmp.isWord;
    }
    
    public boolean startsWith(String prefix) {
        Node tmp = root;
        for(char c : prefix.toCharArray()){
            if(!tmp.children.containsKey(c))   return false;
            tmp = tmp.children.get(c);  
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
// @lc code=end

