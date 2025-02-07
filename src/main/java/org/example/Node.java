package org.example;

public class Node {
    private String text;
    private Node next;

    public Node(String text) {
        this.text = text;
    }

    public Node(String text, Node next) {
        this.text = text;
        this.next = next;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node {" +
                "text='" + text + '\'' +
                '}';
    }
}
