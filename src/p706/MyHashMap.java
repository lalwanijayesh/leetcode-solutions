package p706;

/**
 * 706. Design HashMap
 * https://leetcode.com/problems/design-hashmap/
 */
class MyHashMap {
    class ListNode {
        int key;
        int val;
        ListNode next;

        ListNode (int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private ListNode[] list;
    private int SIZE = 2069;

    public MyHashMap() {
        list = new ListNode[SIZE];
    }

    public void put(int key, int value) {
        int hashed = hash(key);
        if (list[hashed] == null) {
            list[hashed] = new ListNode(key, value);
        } else {
            ListNode node = list[hashed];
            ListNode prev = null;
            while (node != null) {
                if (node.key == key) {
                    node.val = value;
                    return;
                }
                prev = node;
                node = node.next;
            }
            prev.next = new ListNode(key, value);
        }
    }

    public int get(int key) {
        int hashed = hash(key);
        ListNode node = list[hashed];
        while (node != null) {
            if (node.key == key) {
                return node.val;
            }
            node = node.next;
        }
        return -1;
    }

    public void remove(int key) {
        int hashed = hash(key);
        ListNode node = list[hashed];
        ListNode prev = null;
        while (node != null) {
            if (node.key == key) {
                if (prev == null) {
                    list[hashed] = node.next;
                } else {
                    prev.next = node.next;
                }
                break;
            }
            prev = node;
            node = node.next;
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }
}