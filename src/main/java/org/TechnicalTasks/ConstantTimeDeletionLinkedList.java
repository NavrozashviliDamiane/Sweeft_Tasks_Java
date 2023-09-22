package org.TechnicalTasks;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class ConstantTimeDeletionLinkedList {
    private HashMap<Integer, Node> map;
    Node head;
    Node tail;

    public ConstantTimeDeletionLinkedList() {
        map = new HashMap<>();
        head = new Node(-1);  // Dummy head node
        tail = new Node(-1);  // Dummy tail node
        head.next = tail;
        tail.prev = head;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        map.put(val, newNode);
        Node prevNode = tail.prev;
        prevNode.next = newNode;
        newNode.prev = prevNode;
        newNode.next = tail;
        tail.prev = newNode;
    }

    public void delete(int val) {
        if (!map.containsKey(val))
            return;

        Node nodeToDelete = map.get(val);
        Node prevNode = nodeToDelete.prev;
        Node nextNode = nodeToDelete.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;

        map.remove(val);
    }


}
