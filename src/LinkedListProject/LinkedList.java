package LinkedListProject;


public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public LinkedList(int data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //LinkedList-de element(node) elave etmek
    public void appendList(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    //LinkedList-in evveline element elave etmek
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //LinkedList-de son elementi silemk
    public Node deleteLast(){
        Node temp = head;
        Node end = head;

        if(length == 0){
            return  null;
        }

        if(length == 1){
            head = null;
            tail = null;
        }else{
            while (temp.next != null){
                end = temp;
                temp = temp.next;
            }
            tail = end;
            tail.next = null;
        }
        length--;
        return temp;
    }

    //LinkedList-in ilk elementini(node) silmek
    public Node deleteFirst(){
        Node temp = head;

        if(length == 0){
            return  null;
        }

        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    //LinkedList-de mueyyen bir index-deki datani silmek
    public Node delete(int index){
        if (index >= 0 && index < length)
        {
            if (index == 0)
            {
                return deleteFirst();
            }
            if (index == length - 1)
            {
                return deleteLast();
            }
            Node temp = getNode(index - 1);
            Node delete = getNode(index);
            temp.next = delete.next;
            delete.next = null;
            length--;
            return delete;
        }else{
            return  null;
        }
    }

    //LinkedList-de mueyyen bir index-deki elementi tapmaq,cagirmaq
    public Node getNode(int index){
        Node temp = head;

        if(index >= 0 && index < length){
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }else{
            return null;
        }
    }

    //LinkedList ilk elementi getirmek
    public int peek(){
        if(head != null){
            return head.data;
        }else {
            return -1;
        }
    }

    //LinkedList-deki mueyyen bir index-deki datani deyismek
    public void setNode(int index, int data){
        Node temp = getNode(index);

        if(temp != null){
            temp.data = data;
        }
    }

    //LinkedList-de mueyyen bir index-e element elave etmek
    public boolean insertNode(int index, int data){

        if(index < 0 || index > length){
            return false;
        }else{
            if(index == 0){
                addFirst(data);
                return true;
            }
            if (index == length - 1) {
                appendList(data);
                return true;
            }

            Node newNode = new Node(data);
            Node temp = getNode(index-1);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }

    //LinkedList elementlerini console-a yazdirmaq
    public void printList(){
        Node temp = head;
        System.out.println("LinkedList: ");
        System.out.println("- - - - - - - - - - - - - - -");

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("- - - - - - - - - - - - - - -");
    }

    //LinkedList-in Head-ini console-a yazdrimaq
    public void printHead(){
        if(head != null){
            System.out.println("Head: " + head.data);
        }
    }

    //LinkedList-in Tail-ini console-a yazdrimaq
    public void printTail(){
        if(tail != null){
            System.out.println("Tail: " + tail.data);
        }
    }

    //LinkedList-in Length-ini console-a yazdrimaq
    public void printLength(){
        System.out.println("Length: " + length);
    }
}
