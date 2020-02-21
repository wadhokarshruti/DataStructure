package practise.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList lList = new LinkedList();
        lList.addLast(lList,10);
        lList.addLast(lList,4);
        lList.addLast(lList,12);
        System.out.println(lList.size());

        java.util.LinkedList<Integer> utilList = new java.util.LinkedList();
        utilList.add(10);
        utilList.add(10);
        System.out.println(utilList);
    }
}
