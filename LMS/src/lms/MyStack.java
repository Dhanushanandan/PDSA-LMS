package lms;

public class MyStack{

    private Node top;
    
    private class Node{
        String data;
        Node next;
        
        
        Node(String data){
        
        this.data =data;
        this.next=null;
        }
    }


    public void push(String n) {
        Node newNode =new Node(n);
        newNode.next=top;
        top=newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty"); //empty
        }
        String value=top.data;
        top=top.next;
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty"); ///empty
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
    
}
