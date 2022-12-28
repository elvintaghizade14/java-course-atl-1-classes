package az.atlacademy.se.lesson15;

public final class Box<D> {

    public final D data;

    public Box(D data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("Box{data=%s}", data);
    }
}
