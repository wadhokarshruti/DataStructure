package practise.linkedlist;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException() {
        super("No element found at given index");
    }
}
