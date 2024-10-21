# DLL Algorithms

## Algorithm insert (newNode, predecessor)
```
In: New node to be inserted after predecessor.
Out: {Inserts newNode in the linked list after predecessor.}

if predecessor is null then {
    make newNode point to front
    if front is not null then 
        make front's previous point to newNode
    front = newNode
    if front's next is null then
        tail = newNode  // Update tail if inserting the first node
}
else {
    succ = node that predecessor points to (predecessor.getNext())
    make newNode point to succ
    make predecessor point to newNode
    if succ is not null then
        make succ's previous point to newNode
    else
        tail = newNode  // Update tail if inserting at the end
}
```

## Algorithm delete (nodeToDelete)
```
In: Node to be deleted.
Out: true if the node was deleted, false otherwise.

current = front
while (current ǂ null) and (current ǂ nodeToDelete) do {
    current = current.getNext()
}

if current is null then
    return false  // Node not found
else {
    if current's previous is not null then
        make current's previous point to current's next
    else 
        front = current.getNext()  // Node to delete is the front

    if current's next is not null then
        make current's next point to current's previous
    else 
        tail = current.getPrevious()  // Node to delete is the tail

    return true
}
```

## Explanation

### Insertion

- If the predecessor is null, the newNode is inserted at the front of the list.
- If predecessor is not null, the newNode is inserted after it, and the previous and next pointers are updated accordingly.
- The tail pointer is updated if the new node is inserted at the end.

## Deletion

- We search for nodeToDelete starting from the front of the list.
- If the node is found, the pointers of the previous and next nodes are adjusted to remove the node.
- If the node is the front or the tail, those pointers are updated accordingly.
- These algorithms handle the insertion and deletion of nodes in a doubly linked list, ensuring that both the next and previous pointers are maintained properly.
