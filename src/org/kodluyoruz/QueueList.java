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
        System.out.println(value);
        if(length == 0){
            firstNode = new Node();
            nextNode = firstNode;
            length++;
        }else{
            nextNode.setNextNode(new Node());
            nextNode = nextNode.getNextNode();
            length++;
        }
        nextNode.setStartNode(value);
        nextNode.setNextNode(null);
    }

    @Override
     public T poll() {
        Node<T> node = firstNode;
        try {
            if (length != 0) {
                length--;
                firstNode = firstNode.getNextNode();
                if (firstNode == null) {
                    nextNode = null;
                    length = 0;
                }
            }
            return node.getStartNode();
        }catch (NullPointerException exception){
            System.out.println(exception.getMessage());
        }
        return null;


    }

    @Override
     public T peek() {
        System.out.println("peek");
        return firstNode != null ?  firstNode.getStartNode() : null;
    }
}
