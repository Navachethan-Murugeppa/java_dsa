package SingleLinkedList;

class SglLinkedList {
    
    public Node head;
    public Node tail;

    public int size;

    public Node createLinkedList(int nodevalue){
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodevalue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Inset method in single linked list
    public void InsertInLinkedList(int nodevalue, int location){
        Node node = new Node();
        node.value = nodevalue;
        if(head == null){
            createLinkedList(nodevalue);
            return;
        }else if (location ==0){
            node.next = head;
            head = node;
            System.out.println("Inserted at the beginning"+nodevalue);
        }else if (location >= size){
            tail.next = node;
            tail = node;
            tail.next = null;
            System.out.println("Inserted at the end"+nodevalue);
        }else {
            Node tempNode = head;
            int index = 0;
            while (index < location -1){
                tempNode = tempNode.next;
                index++;
            }
                    Node nextnode = tempNode.next;
                    tempNode.next = node;
                    node.next = nextnode;
                    
                System.out.println("Inserted at the location"+nodevalue);
            }
            size++;
        }

        // Traversal method in single linked list
        public void TraverseSingleLinkedList(){
            if(head == null){
                System.out.println("Linked list does not exist");
            }else{
                Node TempNode = head;
                for(int i=0;i<size;i++){
                    System.out.print(TempNode.value);
                    if(i!=size-1){
                        System.out.print(" -> ");
                    }
                    TempNode = TempNode.next;
                }
        }
    }
    // search method in single linked list
    boolean searchNode(int nodevalue){
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

    // Delete method in single linked list
    public void deleteNode(int location){
        if(head == null){
            System.out.println("The SLL does not exist");
            return;
        }else if(location ==0){
            head = head.next;
            size--;
            if(size ==0){
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for(int i=0; i<size-1;i++){
                tempNode = tempNode.next;

            }
            if(tempNode ==head){
                tail = head = null;
                size --;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        }else{
            Node TempNode = head;
            for(int i=0;i<location-1;i++){
                TempNode = TempNode.next;
            }
            TempNode.next = TempNode.next.next;
            size--;
        }
    }

    public void deleteEntireSLL(){
        head = null;
        tail = null;
        size = 0;
        System.out.println("The SLL has been deleted");
    }
}
