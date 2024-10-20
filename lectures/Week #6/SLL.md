# SLL Algorithms

## Algorithm insert (newNode, predecessor)

In: New node to be inserted after predecessor.
Out: {Insert newNode in linked list after predecessor; newNode

must be inserted at the front of the list if predecessor is null.}
if predecessor is null then {
    make newNode point to front
    front = newNode
}
else {
    succ = node that predecessor points to
    make newNode point to succ
    make predecessor point to newNode
}

## Explanation for insert algorithm

### Insert at the Front

- If predecessor is null, the newNode is inserted at the front of the list.
- The newNode's next pointer is set to the current front, and the front is updated to newNode.

### Insert in the Middle or End

- If predecessor is not null, the newNode is inserted after the predecessor.
- The new node’s next pointer is set to point to the successor node (succ), which is the node that comes after the predecessor.
- The predecessor’s next pointer is updated to point to the newNode.


## Algorithm delete (nodeToDelete)

In: node to delete
Out: true if the node was deleted, false otherwise

current = front
predecessor = null
while (current ǂ null) and (current ǂ nodeToDelete) do {
    predecessor = current
    current = current.getNext()
}
if current is null then return false
else {
    if predecessor ǂ null then
    make predecessor point to current.getNext()
else front = front.getNext()

return true
}

## Explanation for delete algorithm

### Search for the Node to Delete

- We start at the front and iterate through the list using a current pointer.
- We also maintain a predecessor pointer, which keeps track of the node that comes before current.

### Delete the Node

- If the node to delete is found (current == nodeToDelete), we adjust the next pointer of the predecessor to skip over the node being deleted.
- If nodeToDelete is the front of the list, the front pointer is updated to the next node (front = front.getNext()).
