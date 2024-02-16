import StackProject.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.appendList(2);
//        list.appendList(4);
//        list.appendList(6);
//        list.appendList(8);
//        list.appendList(10);
//        list.appendList(12);
//
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        System.out.println("* * * * * * * * * * * * * * * * * * * *");
//
////        list.addFirst(14);
////        int result = list.deleteLast().data;
////        System.out.println("Result: " + result);
////        int result = list.deleteFirst().data;
////        System.out.println("Result: " + result);
////        System.out.println("Index: " + list.getNode(-1).data);
////        System.out.println("Ilk: " + list.peek());
////        list.insertNode(2,43);
////        list.setNode(0,19);
//        System.out.println("Silinen: " + list.delete(3).data);
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();


//=======================================================================================================================
///////////////////////////////////////       DoublyLinkedList      //////////////////////////////////////////////////////
//=======================================================================================================================

//        DoublyLinkedList list = new DoublyLinkedList();
//
//        list.appendList(3);
//        list.appendList(5);
//        list.appendList(7);
//        list.appendList(9);
//        list.appendList(11);
//        list.appendList(13);
//
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//        System.out.println("* * * * * * * * * * * * * * * * * * * * *");
//
////        list.addFirst(1);
////        System.out.println("Silinen: " + list.deleteLast().data);
////        System.out.println("Silinen: " + list.deleteFirst().data);
////        System.out.println("Data: " + list.getNode(3).data);
////        list.setNode(2,54);
//
//
////        list.insert(3,43);
//       list.delete(0);
//        list.printList();
//        list.printHead();
//        list.printTail();
//        list.printLength();
//
//
// =======================================================================================================================
///////////////////////////////////////            Stack            //////////////////////////////////////////////////////
//=======================================================================================================================

        Stack stack = new Stack();

        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        stack.push(10);

        stack.printAll();
        stack.printTop();
        stack.printCount();

        System.out.println("* * * * * * * * * * * * * * * * * * * * * *");

        stack.pop();
        stack.printAll();
        stack.printTop();
        stack.printCount();
    }
}