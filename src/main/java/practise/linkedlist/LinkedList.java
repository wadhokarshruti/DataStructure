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
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
            size++;
            System.out.println("added"+data);
        }else{
            Node first = this.head;
            newNode.next = first;
            this.head = newNode;
            size++;
            System.out.println("added"+data);
        }
    }

    public int getAt(int index) throws ElementNotFoundException {
        Node desired = this.head;
        if(index == 0) return desired.data;
        else {
            int count = 0;
            while(count<index && desired.next != null){
                count++;
                desired = desired.next;
            }
            if(count !=0 && count == index) {
                return desired.data;
            }
        }
        throw  new ElementNotFoundException();
    }


    public int size(){
        return size;
    }


}
