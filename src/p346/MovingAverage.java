package p346;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 346. Moving Average from Data Stream
 * https://leetcode.com/problems/moving-average-from-data-stream/
 */
public class MovingAverage {
    private Queue<Integer> q;
    private int size;
    private double total;

    public MovingAverage(int size) {
        this.q = new LinkedList<>();
        this.size = size;
    }

    public double next(int val) {
        if (q.size() == size) {
            total -= q.remove();
        }
        q.add(val);
        total += val;
        return total / q.size();
    }
}
