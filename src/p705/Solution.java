package p705;

import java.util.ArrayList;
import java.util.List;

/**
 * 705. Design HashSet
 * https://leetcode.com/problems/design-hashset/
 */
class MyHashSet {
    List<Integer>[] buckets;

    public MyHashSet() {
        buckets = (List<Integer>[]) new List[2069];
    }

    public void add(int key) {
        int hashcode = hash(key);
        List<Integer> list = buckets[hashcode];
        if (list == null) {
            list = new ArrayList<>();
            list.add(key);
            buckets[hashcode] = list;
        } else {
            if (!list.contains(key)) {
                list.add(key);
            }
        }
    }

    public void remove(int key) {
        int hashcode = hash(key);
        List<Integer> list = buckets[hashcode];
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == key) {
                    list.remove(i);
                    return;
                }
            }
        }
    }

    public boolean contains(int key) {
        int hashcode = hash(key);
        List<Integer> list = buckets[hashcode];
        if (list != null && list.contains(key)) {
            return true;
        }
        return false;
    }

    private int hash(int key) {
        return key % 2069;
    }
}