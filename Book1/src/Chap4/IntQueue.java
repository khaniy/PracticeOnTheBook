package Chap4;

public class IntQueue {
    private int[] que; //큐용 저장소
    private int capacity; // 용량
    private int front; //맨 앞의 요소 커서
    private int rear; // 맨 뒤의 요소 커서
    private int num; //큐에 저장된 데이터 갯수

    public static class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public static class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == capacity)
            rear = 0;
        return x;
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if (front == capacity)
            front = 0;
        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (front + i) % capacity;
            if (que[idx] == x)
                return idx;
        }
        return -1;
    }

    public int getCapacity() {
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
        if (isEmpty())
            System.out.println("큐가 비어 있습니다");
        else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity]+" ");
            }
            System.out.println();
        }
    }



}
