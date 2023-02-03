package az.atlacademy.module01.lesson18;

public class MyNode<T> {

    private T data;
    private MyNode<T> next;

    public MyNode(T data) {
        this.data = data;
    }

    public MyNode(T data, MyNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "[" + data + "]";
    }

}
