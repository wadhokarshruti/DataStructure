package practise.linkedlist;

public class LinkedList {
    Node head;

    transient int size = 0;

    public void addLast(LinkedList list, int data){
        Node newNode = new Node(data);
        if(null == list.head){
            list.head = newNode;
            size++;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
            size++;
        }
        System.out.println("added"+newNode.data);
    }

    public void addFirst(LinkedList list, int data){

    }


    public int size(){
        return size;
    }


}
