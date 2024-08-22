package lms;

class Node<T> {

    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }

}

public class MyLinkedList<T> {

    Node<T> head;
    Node<T> tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    public void add(T item) {
        if (head == null) {
            Node<T> newData = new Node<>(item);
            head = newData;
            tail = head;
        } else {
            Node<T> newData = new Node<>(item);
            tail.next = newData;
            tail = newData;
        }
    }

    public void display() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.data + ",");
            temp = temp.next;
        }
    }

    public void remove(T item) {
        Node<T> temp = head;
        if (head == null) {
            return;
        }
        if (head.data == item) {
            head = head.next;
        } else {
            while (temp != null) {
                if (temp.next != null && temp.next.data == item) { //to solve last item
                    Node<T> rmdataref = temp.next; //for remove referance of removed data
                    temp.next = temp.next.next;
                    rmdataref = null;
                }
                temp = temp.next;
            }
        }
    }

    public T getLastvalue() {
        if (tail != null) {
            return tail.data;
        } else {
            return null;
        }
    }

    public T getbeforelast() {
        if (head == null || head.next == null) {
            return null;
        }

        Node<T> currentNode = head;
        while (currentNode.next != tail) {
            currentNode = currentNode.next;
        }
        return currentNode.data;

    }

    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean isempty(){
        return head==null;
    }

    
}
