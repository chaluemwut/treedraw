package com.github.chaluemwut;

public class Node {
    private Object element;
    private Node left, right;

    public Node(Object e, Node l, Node r) {
        element = e;
        left = l;
        right = r;
    }

    public Object getValue() {
        return element;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}
