public class Node <T> {

    private Node<T> nextNode;
    private Node<T> prevNode;
    T data;
    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }



    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }
    public Node(T data) {
     this.data = data;
    }
}