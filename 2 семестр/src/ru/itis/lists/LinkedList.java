package ru.itis.lists;

import java.util.Iterator;

public class LinkedList<T> implements List<T>  {

    

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    private int count;

    public LinkedList() {
        this.count = 0;
    }

    @Override
    public int indexOf(T element) {
        Node newNode = new Node(element);
        int index = 0;
        Node current=head;
        while (current != null) {
            if (current.value.equals(newNode.value)) {
                index++;
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        int contain_index=0;
        Node current=head;
        while(index!=contain_index){
            current=current.next;
            contain_index++;
        }
        return current.value;
    }

    @Override
    public void addToBegin(T element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head = newNode;
            head.next = head;
        }
        count++;
    }

    @Override
    public void add(T element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    @Override
    public void remove(T element) {

        Node newNode = new Node(element);
        Node current= head;
        Node previous = null;
        while (current != null) {
            if (current.value.equals(newNode.value)) {
                if (previous != null) {
                    previous.next = current.next;
                    count--;
                    return;
                } else {
                    head = current.next;
                    count--;
                    return;
                }
            } else {
                previous = current;
                current = current.next;
            }
        }

    }

    @Override
    public boolean contains(T element) {

        Node newNode = new Node(element);
        Node current = head;
        while (current != null) {
            if (current.value.equals(newNode.value)) {
                return true;
            } else {
                current = current.next;
            }
        }

        return false;

    }
    public void showList(){
        Node current=head;
        while( current.next!=null){
            System.out.print(current.value+" ");
            current=current.next;
        }
        System.out.print(current.value);

    }
    public void reverse() {
        Node current=head;
        LinkedList list=new LinkedList();
        while(current.next!=null){
            list.addToBegin(current.value);
            current=current.next;
        }
        list.addToBegin(current.value);
        head=list.head;
    }

    @Override
    public int size() {
        return count;
    }

    private class LinkedListIterator implements Iterator<T> {

        private Node current;

        public LinkedListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current.next == null;
        }

        @Override
        public T next() {
            T result = current.value;
            current=current.next;
            return result;
        }
    }

    public Iterator<T> iterator() {
        return new LinkedListIterator();
    }

    public static <E extends Comparable<E>> LinkedList merge(LinkedList<E> a, LinkedList<E> b) {

        LinkedList newLinkedList=new LinkedList();

        Iterator<E> iteratorA = a.iterator();
        Iterator<E> iteratorB = b.iterator();

        if (a.head==null){ return b; }
        if (b.head==null){ return a; }

        while(iteratorA.hasNext()){
             newLinkedList.head=a.head;
             newLinkedList.head.next=a.head.next;
        }
        while(iteratorB.hasNext()){

        }

        return newLinkedList;
    }
}
