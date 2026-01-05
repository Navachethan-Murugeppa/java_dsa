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
            size++;
        }else if(location >= size){
            tail.next = node;
            tail = node;
            tail.next = head;
            size++;
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

    // Traversal in circular linked list
    public void traverseCLL(){
        if(head != null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print( tempNode.value );
                if(i != size -1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
                System.out.print("\n");
            }else{
                System.out.println("the circular linked list does not exist");
            }
        // if(head == null){
        //     System.out.println( "The circular linked list does not exist" );
        // }
        // else{
        //     Node tempNode = head;
        //     for(int i=0;i<size;i++){
        //         System.out.print( tempNode.value );
        //         if(i != size -1){
        //             System.out.print(" -> ");
        //         }
        //         tempNode = tempNode.next;
        //     }
        // }
    }

    // search   in circular linked list

    public boolean searchCLL(int nodevalue){
        if(head != null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value == nodevalue){
                    System.out.println("Found the node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found");
        return false;
    }

    // delete node in circular linked list

    public void deleteNodeCLL(int location){
        if(head == null){
            System.out.println("The circular linked list does not exist");
                return;
        }else if(location ==0){
            head = head.next;
            tail.next = head;
            size --;
            if(size ==0){
                head = null;
                head.next = null;
                tail = null;
            }
        }
        else if (location >= size){
            Node tempNode = head;
            for(int i=0;i<size -1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode == head){
                head = null;
                tail = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }else{
            Node tempNode = head;
            for(int i=0;i<location -1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size --;
    }
}
// Delete entire cll

public void dltentirecll(){
    head = null;
    tail.next = null;
    tail = null;
    System.out.println("The circular linked list has been deleted");
}

}
    
