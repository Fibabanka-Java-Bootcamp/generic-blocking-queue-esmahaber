package org.kodluyoruz;

class QueueList<T>  implements Queue<T> {
    private Node<T> firstNode;
    private Node<T> nextNode;
    private int length;

    public QueueList(){
        this.length = 0;
    }

    @Override
    public void add(T value) {
        if(length == 0){
            firstNode = new Node();
            nextNode = firstNode;
            length++;
        }else{
            nextNode.nextNode= new Node();
            nextNode = nextNode.nextNode;
            length++;
        }
        nextNode.startNode = value;
        nextNode.nextNode = null;
    }

    @Override
    public T poll() {
            Node<T> node = firstNode;
            if (length != 0) {
                length--;
                firstNode = firstNode.nextNode;
                if (firstNode == null) {
                    nextNode = null;
                    length = 0;
                }
            }else {
                return null;
            }
            return node.startNode;
    }

    @Override
    public T peek() {
        return firstNode != null ?  firstNode.startNode : null;
    }
}
