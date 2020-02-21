package practise.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.addLast(lList,10);
        lList.addLast(lList,4);
        lList.addLast(lList,12);
        lList.addFirst(lList,33);
        try {
            System.out.println(lList.getAt(8));
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(lList.size());

        java.util.LinkedList<Integer> utilList = new java.util.LinkedList();
        utilList.add(10);
        utilList.add(10);
        System.out.println(utilList);
    }
}
