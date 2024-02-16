package DoublyLinkedListProject;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public DoublyLinkedList(int data){
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    //DoublyLinkedList-in sonuna element elave etmek
    public void appendList(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    //DoublyLinkedList-in evveline element elave etmek
    public void addFirst(int data){
        Node newNode = new Node(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    //DoublyLinkedList-in son elementini silmek
    public Node deleteLast(){
        Node temp = tail;

        if(length == 0){
            return null;
        }

        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    //DoublyLinkedList-in ilk elementini silmek
    public Node deleteFirst(){
        Node temp = head;

        if(length == 0){
            return null;
        }

        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    //DoublyLinkedList-de mueyyen index-deki datani getirmek
    public Node getNode(int index){
        Node temp = head;

        if (index < 0 || index >= length)
        {
            return null;
        }

        //Sol terefe yaxindir demek soldan baslayacaq
        if (index < length / 2)
        {
            for (int i = 0; i < index; i++)
            {
                temp = temp.next;
            }
        }
        //Sag terefden baslayacaq
        else
        {
            temp = tail;
            for (int i = length - 1; i > index; i--)
            {
                temp = temp.prev;
            }
        }
        return temp;
    }

    //DoublyLinkedList-de mueyyen bir index-deki datanin deyerini deyismek
    public void setNode(int index, int data){
        Node temp = getNode(index);

        if(temp != null){
            temp.data = data;
        }
    }

    //DoublyLinkedList-de mueyyen bir index-e data(node) elave etmek
    public boolean insert(int index,int data){

        if (index < 0 || index >= length)
        {
            return false;
        }
        else
        {
            if (index == 0)
            {
                addFirst(data);
                return true;
            }
            if (index == length - 1)
            {
                appendList(data);
                return true;
            }

            Node newNode = new Node(data);
            Node prevNode = getNode(index - 1);
            Node nextNode = getNode(index);

            newNode.prev = prevNode;
            newNode.next = nextNode;
            prevNode.next = newNode;
            nextNode.prev = prevNode;
            length++;
            return true;
        }
    }

    //DoublyLinkedList-de mueyyen bir indexi ve datani silmek
    public Node delete(int index){
        Node deleteNode = null;
        if (index >= 0 && index < length)
        {
            if (index == 0)
            {
                deleteFirst();
            }

            else if (index == length - 1)
            {
                deleteLast();
            }
            else
            {
                deleteNode = getNode(index);
                deleteNode.next.prev = deleteNode.prev;
                deleteNode.prev.next = deleteNode.next;
                deleteNode.next = null;
                deleteNode.prev = null;
                length--;
            }
        }
        else
        {
            return null;
        }
        return deleteNode;
    }

    //DoublyLinkedList elementlerini console-a yazdirmaq
    public void printList(){
        Node temp = head;
        System.out.println("DoublyLinkedList: ");
        System.out.println("- - - - - - - - - - - - - - -");

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("- - - - - - - - - - - - - - -");
    }

    //DoublyLinkedList-in Head-ini console-a yazdrimaq
    public void printHead(){
        if(head != null){
            System.out.println("Head: " + head.data);
        }
    }

    //DoublyLinkedList-in Tail-ini console-a yazdrimaq
    public void printTail(){
        if(tail != null){
            System.out.println("Tail: " + tail.data);
        }
    }

    //DoublyLinkedList-in Length-ini console-a yazdrimaq
    public void printLength(){
        System.out.println("Length: " + length);
    }
}
