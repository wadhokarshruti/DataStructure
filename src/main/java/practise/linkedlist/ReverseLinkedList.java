package practise.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {
    private LinkedList reversedLinkedList ;
    public LinkedList reverseLinkedList(LinkedList list) throws ElementNotFoundException {
        reversedLinkedList = new LinkedList();
        for (int i =0; i< list.size(); i++){
            reversedLinkedList.addFirst(list.getAt(i));
        }
        return reversedLinkedList;
    }

    @Override
    public String toString() {
        List<Object> list;
        if(null != reversedLinkedList){
            list = new ArrayList<Object>();
            for (int i =0; i< reversedLinkedList.size(); i++){
                try {
                    list.add(reversedLinkedList.getAt(i));
                } catch (ElementNotFoundException e) {
                    e.printStackTrace();
                }
            }
            //System.out.println(Arrays.toString(list.toArray()));
            return list.toString();
        }
        return super.toString();
    }

    public static void main(String[] args) {
        //normal linked list
        LinkedList lList = new LinkedList();
        lList.addLast(lList,1);
        lList.addLast(lList,2);
        lList.addLast(lList,3);
        lList.addFirst(10);
        lList.addFirst(20);
        try {
            System.out.println(lList.getAt(0));
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lList.size());
        System.out.println("----reversed list-------");
        try {
            ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
            System.out.println(reverseLinkedList.reverseLinkedList(lList).toString());
            System.out.println(reverseLinkedList);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }

    }
}
