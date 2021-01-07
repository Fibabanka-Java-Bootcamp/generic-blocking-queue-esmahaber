package org.kodluyoruz;

public interface  Queue<T> {

    public void add(T value);

    public T poll();

    public T peek();
}
