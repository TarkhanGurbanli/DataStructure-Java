package QueueProject;

public class Queue {
    private Node head;
    private Node tail;
    private int size;

    public Queue(){
        this.head = null;
        this.tail = null;
        size = 0;
    }

    public Queue(int data){
        Node newNode = new Node(data);
        this.head = newNode;
        this.tail = newNode;
        size = 1;
    }

    //Queue-ya element elave etmek
    public void enqueue(int data){
        Node newNode = new Node(data);

        if(size == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //Queue FIFO mentiqi ile isleyir, yeni First in First Out (Ilke daxil olan ilk cixar)
    //Queue-dan element(node) silmek
    public Node dequeue(){
        Node temp = head;
        if(size == 0){
            return null;
        }

        if(size == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            temp.next = null;
        }
        size--;
        return temp;
    }

    //Queue-nun bos olub olmadigini yoxlamaq
    public boolean isEmpty(){
        return size == 0;
    }

    //Queue-nun ilk elementini qaytarir
    public int peek(){
        if(size != 0){
            return head.data;
        }else{
            return -1;
        }
    }
}
