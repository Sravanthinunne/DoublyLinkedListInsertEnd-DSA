class DLList {
     class Node {
         
         
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    public void InsertEnd(int data) {
        
        Node newNode = new Node(data);
        
        
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        
        temp.next = newNode;
        newNode.prev = temp;
    }
    
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLList list = new DLList();
        
        list.InsertEnd(101);
        list.InsertEnd(205);
        list.InsertEnd(309);
        
        list.printList(); 
        
       
    }
}

    
   
    