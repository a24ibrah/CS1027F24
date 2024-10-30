public class LinearNode<T> {
    private T dataItem;            // The data stored in this node
    private LinearNode<T> next;     // Reference to the next node in the list

    // Constructor: Initializes a node with given data and no next node
    public LinearNode(T dataItem) {
        this.dataItem = dataItem;
        this.next = null;
    }

    // Gets the data item stored in this node
    public T getDataItem() {
        return dataItem;
    }

    // Sets the data item for this node
    public void setDataItem(T dataItem) {
        this.dataItem = dataItem;
    }

    // Gets the reference to the next node in the list
    public LinearNode<T> getNext() {
        return next;
    }

    // Sets the reference to the next node in the list
    public void setNext(LinearNode<T> next) {
        this.next = next;
    }
}
