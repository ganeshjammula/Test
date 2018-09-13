package com.org.ds.Ll;


public class LL {
   public Node head;
   public int size;

    //test stash
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    static class Node {
        private int data;
        private Node next;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    public void add(int data) {
        LL.Node node = new LL.Node();
        node.setData(data);
        node.setNext(null);

        if (head == null) {
            head = node;
            size++;
        } else {
            LL.Node current = head;
            while (current.getNext() != null) {
                size++;
                current = current.getNext();
            }
            current.setNext(node);
        }
    }

    public int get(int index) {
        LL.Node current = null;

        if (index <= -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (head != null) {
            current = head;
        }

        for (int i = 0; i <= index; i++) {
            if (i != index) {
                current = current.getNext();// 0,1,2,3
            }

        }
        return current.getData();

    }

    public void remove(int index) {
        LL.Node current = null;
        LL.Node previous = null;

        if (index <= -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        if (head != null) {
            current = head;
        }

        for (int i = 0; i <= index; i++) {
            if (i != index) {
                previous = current;
                current = current.getNext();// 0,1,2,3
            }

        }
        previous.setNext(current.getNext());
        current = null;

    }

    public static void main(String args[]) {
        LL list = new LL();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.size);
        list.remove(3);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


    }

}
