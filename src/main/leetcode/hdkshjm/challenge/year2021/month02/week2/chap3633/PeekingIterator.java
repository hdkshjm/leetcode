package leetcode.hdkshjm.challenge.year2021.month02.week2.chap3633;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer current;
    private boolean isLast = false;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        if (this.iterator.hasNext()) current = this.iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return current;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (!this.iterator.hasNext()) {
            isLast = true;
            return current;
        }

        Integer ret = current;
        current = this.iterator.next();
        return ret;
    }

    @Override
    public boolean hasNext() {
        return !isLast;
    }
}
