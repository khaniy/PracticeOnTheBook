package Chap4;

public class IntArrayQueue {
    private int[] que;
    private int capacity;
    private int num;

    public static class EmptyIntArrayQueueException extends RuntimeException {
        public EmptyIntArrayQueueException() {
        }
    }

    public static class OverflowIntArrayQueueException extends RuntimeException {
        public OverflowIntArrayQueueException() {
        }
    }

    public IntArrayQueue(int maxlen) {
        capacity = maxlen;
        num = 0;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enQueue(int x) throws OverflowIntArrayQueueException {
        if (num >= capacity)
            throw new OverflowIntArrayQueueException();
        que[num++] = x;
        return x;
    }

    public int deQueue() throws EmptyIntArrayQueueException {
        if (num <=0)
            throw new EmptyIntArrayQueueException();
        int x = que[0];
        for (int i = 0; i < num - 1; i++) {
            que[i] = que[i + 1];
        }
        num--;
        return x;
    }

    public int peek() throws EmptyIntArrayQueueException {
        if (num <= 0)
            throw new EmptyIntArrayQueueException();
        return que[num - 1];
    }


    public int indexOf(int x) {
        for (int i = 0; i < num; i++)
            if (que[i] == x)
                return i;
        return -1;
    }

    public void clear() {
        num = 0;
    }


    public int capacity() {
        return capacity;
    }


    public int size() {
        return num;
    }


    public boolean isEmpty() {
        return num <= 0;
    }


    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어 있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }
}
