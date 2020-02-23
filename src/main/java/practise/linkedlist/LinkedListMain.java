package practise.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
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

        /*java.util.LinkedList<Integer> utilList = new java.util.LinkedList();
        utilList.add(10);
        utilList.add(10);
        System.out.println(utilList);*/
    }
}
