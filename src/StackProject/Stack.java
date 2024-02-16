package StackProject;

public class Stack {
    private Node top;
    private Node next;
    private int count;

    public Stack(){
        top = null;
        count = 0;
    }

    public Stack(int data){
        Node newNode = new Node(data);
        top = newNode;
        count = 1;
    }

    //Stack-e element(node) elave etmek
    public void push(int data){
        Node newNode = new Node(data);

        if (count == 0){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        count++;
    }

    //Stack en son elave olunan elementini silmek
    public Node pop(){
        Node temp = top;

        if(count == 0){
            return null;
        }

        if (count == 1){
            top = null;
        }else{
            top = top.next;
            temp.next = null;
        }
        count--;
        return temp;
    }

    //Stack-in bos olub olmadigini yoxlamaq
    public boolean isEmpty(){
        return count == 0;
    }

    //Stack elemetlerini console-a yazdrimaq
    public void printAll(){
        Node temp = top;
        System.out.println("Stack: ");
        System.out.println("- - - - - - - - - - - - - - - - - - - -");

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    }

    //Stack-in top elementini console-a yazdrimaq
    public void printTop(){
        if(top != null){
            System.out.println("Top: " + top.data);
        }
    }

    //Stack count-unu console-a yazdrimaq
    public void printCount(){
        System.out.println("Count: " + count);
    }
}
