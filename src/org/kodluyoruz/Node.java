package org.kodluyoruz;

public class Node<T> {
    private T startNode;
    private Node nextNode ;

    public T getStartNode() {
        return startNode;
    }

    public void setStartNode(T startNode) {
        this.startNode = startNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
