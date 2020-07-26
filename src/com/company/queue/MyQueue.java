package com.company.queue;

import com.company.stack.MyStack1;
import com.company.stack.MyStack2;

import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<T> {

    /***
     * my queues
     */
    private MyStack1<T> myStack1;
    private MyStack2<T> myStack2;

    public MyQueue() {
        myStack1= new MyStack1<T>();
        myStack2= new MyStack2<T>();
    }
    /**
     * Placing item x in the queue.
     *
     * @throws IllegalStateException Queue is full
     */
    public void enqueue(T x) {
        while (!myStack1.isEmpty()) {
            myStack2.push(myStack1.pop());
        }
        myStack1.push(x);
        while (!myStack2.isEmpty()) {
            myStack1.push(myStack2.pop());
        }
    }
    /**
     * Removing the front element from the queue.
     *
     * @return The front element of the queue
     * @throws java.util.NoSuchElementException Queue is empty
     */
    public T dequeue() {
        if (myStack1.isEmpty()){
            throw new NoSuchElementException("Queue is empty");
        }
        T x = myStack1.top();
        myStack1.pop();
        return x;
    }
    /**
     * @return The front element of the queue.
     * @throws java.util.NoSuchElementException Queue is empty
     */
    public T front() {
        if (myStack1.isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return myStack1.front();
    }
    /**
     * @return The rear element of the queue
     * @throws java.util.NoSuchElementException Queue is empty.
     */
    public T rear() {
        if (myStack1.isEmpty())
            throw new NoSuchElementException("Queue is empty");
        return myStack1.rear();
    }
    /**
     * @return Size (number of elements).
     */
    public int size() {
        return myStack1.size();
    }
    public List<T> readAll(){
        return myStack1.getAll();
    }
}
