package org.example;

public class LinkedList {
    private int size;
    private Node head;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
        this.size = 1;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }
        size++;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (size == 1) {
            System.out.println(head.toString() + " has been removed.");
            head = null;
        } else {
            Node current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            System.out.println(current.getNext().toString() + " has been removed.");
            current.setNext(null);
        }
        size--;
    }

    public void removeByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            System.out.println(head.toString() + " has been removed.");
            head = head.getNext();
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            System.out.println(current.getNext().toString() + " has been removed.");
            current.setNext(current.getNext().getNext());
        }
        size--;
    }

    public int getSize() {
        return size;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public String toString() {
        if (head == null) return "LinkedList: Empty";

        Node current = head;
        StringBuilder nodeText = new StringBuilder();
        while (current != null) {
            nodeText.append(current.toString()).append(" ");
            current = current.getNext();
        }
        return "LinkedList: " + nodeText.toString().trim();
    }
}
