/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start

import java.util.HashMap;

class LRUCache {
    HashMap<Integer, Integer> map = new HashMap<>();
    Deque<Integer> q = new ArrayDeque<>();
    int size;
    public LRUCache(int capacity) {
        size = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            q.remove(key);
            q.add(key);
            return map.get(key);
        }
            
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)) {
            q.remove(key);
        }
        else if(map.keySet().size() == size){
                map.remove(q.poll());
        }
            q.add(key);
            map.put(key, value);
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

