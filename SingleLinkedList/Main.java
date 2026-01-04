package SingleLinkedList;

public class Main {
    public static void main(String[] args) {

        SglLinkedList l1 = new SglLinkedList();
        l1.createLinkedList(10);
        System.out.println(l1.head.value);
        l1.InsertInLinkedList(20, 1);
        l1.InsertInLinkedList(30, 2);
        l1.InsertInLinkedList(5, 0);
        l1.InsertInLinkedList(15, 2);

        l1.TraverseSingleLinkedList();

        l1.searchNode(20);
        l1.searchNode(25);
        l1.searchNode(15);

        l1.deleteNode(0);
        l1.deleteNode(2);
        l1.deleteNode(5);

        

    }
    
}
