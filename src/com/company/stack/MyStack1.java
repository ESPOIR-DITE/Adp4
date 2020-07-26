package com.company.stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyStack1<T> {

    private ArrayDeque<T> deque = new ArrayDeque<T>();

    public void push(T obj){
        deque.push(obj);
    }
    public T pop(){
        return deque.pop();
    }
    public T top(){
        return deque.peekLast();
    }
    public int size(){
        return deque.size();
    }
    public boolean isEmpty(){
        return deque.isEmpty();
    }
    public T front(){
        return deque.getFirst();
    }
    public T rear(){
        return deque.getLast();
    }
    public List<T> getAll(){
        List<T> myList = new ArrayList<>();
        Iterator<T> iterate = deque.iterator();
        while (iterate.hasNext()){
            myList.add(iterate.next());
        }
        return myList;
    }
}
