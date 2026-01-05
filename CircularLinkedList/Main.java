package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        cirsingList cll = new cirsingList();
        cll.createCircularLinkedList(10);
        System.out.println(cll.head.value);
        System.out.println(cll.head.next.value);

        cll.InsertinCLL(20, 1);
        cll.InsertinCLL(30, 2);
        cll.InsertinCLL(5, 0);
        cll.InsertinCLL(15, 2);

        
    }
    
}
