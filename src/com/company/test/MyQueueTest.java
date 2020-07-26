package com.company.test;

import com.company.student.Student;
import com.company.queue.MyQueue;
import org.junit.Before;
import org.junit.Test;

public class MyQueueTest {
    private MyQueue<Student> myQueue;
    Student student;
    Student student1;
    Student student2;
    Student student3;
    Student student4;

    @Before
    public void setUp() throws Exception {
        myQueue = new MyQueue<Student>();
        student =new Student("espoit","diteekemena",1233);
        student1 =new Student("espoit1","diteekemena",1233);
        student2 =new Student("espoit2","diteekemena",1233);
        student3 =new Student("espoit3","diteekemena",1233);
        student4 =new Student("espoit4","diteekemena",1233);
    }

    @Test
    public void enqueue() {
        myQueue.enqueue(student);
        myQueue.enqueue(student1);
        myQueue.enqueue(student2);
        myQueue.enqueue(student3);
        myQueue.enqueue(student4);
        System.out.println(myQueue.readAll());
    }

    @Test
    public void dequeue() {
        //Adding student to a queue
        myQueue.enqueue(student);
        myQueue.enqueue(student1);
        myQueue.enqueue(student2);
        myQueue.enqueue(student3);
        myQueue.enqueue(student4);
        //Removing an student, we should not see "espoir" in the queue
        myQueue.dequeue();
        System.out.println(myQueue.readAll());
    }

    @Test
    public void front() {
        myQueue.enqueue(student);
        myQueue.enqueue(student1);
        myQueue.enqueue(student2);
        myQueue.enqueue(student3);
        myQueue.enqueue(student4);
        // we should see the first student in the queue
        System.out.println(myQueue.front());
    }

    @Test
    public void size() {
        myQueue.enqueue(student);
        myQueue.enqueue(student1);
        myQueue.enqueue(student2);
        myQueue.enqueue(student3);
        myQueue.enqueue(student4);
        System.out.println("The size of the queue is: "+myQueue.size());
    }
}