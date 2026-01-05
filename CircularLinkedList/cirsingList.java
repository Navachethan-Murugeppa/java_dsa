package CircularLinkedList;

public class cirsingList {
    public Node head;
    public Node tail;
    public int size;

    public Node createCircularLinkedList(int nodevalue){
        head = new Node();
        Node node = new Node();
        node.value = nodevalue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;

    }

    public void InsertinCLL(int nodevalue, int location){
        Node node = new Node();
        node.value = nodevalue;
        if(head == null){
            createCircularLinkedList(nodevalue);
            return;
        }else if(location ==0){
            node.next = head;
            head = node;
            tail.next = head;
        }else if(location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;
        }else{
            Node tempNode = head;
            // int i =0;
            for(int i=0;i<location -1;i++){
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
            size++;


        }
    }
}
    
