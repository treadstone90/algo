/**
 * Created by karthik on 1/30/16.
 * Need to deal with the case null inserts
 * Using skip list I can make inserts O(logn)
 */
public class OneStreamingMedian {
    Node head;
    Node tail;
    Node median1;
    Node median2;
    int currentCount = 0;
    int listSize = 0;

    public OneStreamingMedian() {
        head = null;
        median1 = null;
        median2 = null;
        tail= null;
    }

    public void add(int num) {
        Node n = new Node(num, currentCount);
        if(head == null) {
            head = n;
            tail = head;
            median1 = head;
            return;
        } else if(median1 != null && median2 != null) {
            if(num < median1.data) {
                insertNode(n, this.head);
                //insert num from head to median1
                median2 = null;
            } else if(num > median2.data) {
                insertNode(n, median2);
                // insert num from median.next to tail;
                median1 = null;
            } else if(num == median1.data) {
                median1.next = n;
                n.prev = median1;
                median2.prev = n;
                n.next = median2;
                median1 = n;
                median2 = null;

            } else if(num == median2.data) {
                insertNode(n, median2);
                median1 = null;
            } else {
                median1.next = n;
                n.prev = median1;
                n.next = median2;
                median2.prev = n;
                median1 = n;
                median2 = null;
            }
        } else if(median1 != null) {
            if(num < median1.data) {
                insertNode(n, this.head);
                median2 = median1;
                median1 = median2.prev;
            } else if(num >= median1.data) {
                insertNode(n, median1);
                //insert after median1
                median2 = median1.next;
            }
        } else {
            if(num < median2.data) {
                //insert node before median
                insertNode(n, this.head);
                median1 = median2.prev;
            } else if(num >= median2.data) {
                //insert after median1
                insertNode(n, median2);
                median1 = median2;
                median2 = median2.next;
            }
        }
        currentCount++;
        listSize++;
    }

    private void insertNode(Node n, Node head) {
        // if head is null it can never mean an emoty list
        Node temp = head;
        while(temp != null && temp.data <= n.data) {
            temp = temp.next;
        }

        if(temp == null) {
            this.tail.next = n;
            n.prev = this.tail;
            this.tail = n;
        } else {
            n.next = temp;
            n.prev = temp.prev;
            if(temp == this.head) {
                this.head = n;
            } else {
                temp.prev.next = n;
            }
            temp.prev = n;
        }
    }

    public float findMedian() {
        if(median1 != null && median2 != null) {
            assert (median1.next == median2);
            return (1.0f*median1.data + median2.data)/2;
        } else if(median1 == null) {
            return median2.data;
        } else {
            return median1.data;
        }
    }

    public static void main(String[] args) {
        OneStreamingMedian m = new OneStreamingMedian();
        m.add(0);
        m.add(0);
        m.add(0);
        m.add(10);
        m.add(1);
        m.add(5);
        m.add(-1);
        m.add(11);
        m.add(12);

        System.out.println(m.findMedian());
    }
}

class Node {
    int index;
    int data;
    Node next;
    Node prev;

    public Node(int data, int index) {
        next = null;
        prev = null;
        this.data = data;
        this.index = index;
    }
}

