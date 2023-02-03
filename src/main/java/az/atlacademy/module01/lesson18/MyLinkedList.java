package az.atlacademy.module01.lesson18;

public class MyLinkedList<T> {

    private MyNode<T> head;

    public void add(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) head = newNode;
        else head.setNext(newNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        MyNode<T> curr = head;
        while (curr.getNext() != null) {
            sb.append(curr);
            curr = curr.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
