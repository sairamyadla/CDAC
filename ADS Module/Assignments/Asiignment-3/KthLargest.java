import java.util.PriorityQueue;

public class KthLargest {
    private PriorityQueue<Integer> minHeap;
    private int k;

    public KthLargest(int k) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
    }
    public void add(int num) {
        if (minHeap.size() < k) {
            minHeap.offer(num);  
        } else {
            if (num > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(num);
            }
        }
    }

    public int getKthLargest() {
        if (minHeap.size() < k) {
            return -1;  
        }
        return minHeap.peek();  
    }

    public static void main(String[] args) {
        int[] stream1 = {3, 10, 5, 20, 15};
        int k1 = 3;
        KthLargest kth1 = new KthLargest(k1);
        
        for (int num : stream1) {
            kth1.add(num);
        }
        System.out.println(kth1.getKthLargest()); 
        
        int[] stream2 = {7, 4, 8, 2, 9};
        int k2 = 2;
        KthLargest kth2 = new KthLargest(k2);
        
        for (int num : stream2) {
            kth2.add(num);
        }
        System.out.println(kth2.getKthLargest()); 
    }
}
