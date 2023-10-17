package com.practice.customdatastructure;

public class TestCustomDataStructure {
    public static void main(String[] args) {
        /*MyQueue queue = new MyQueue();
        queue.enqueue(3);
        queue.enqueue(13);
        if(!queue.isEmpty()){
            System.out.println("Queue Front : " + queue.getFront());
        }
        queue.dequeue();
        if(!queue.isEmpty()){
            System.out.println("Queue Front : " + queue.getFront());
        }*/

        MyCircularQueue circularQueue = new MyCircularQueue(6);
        circularQueue.enQueue(6);
        circularQueue.rear();
        circularQueue.rear();
        circularQueue.deQueue();
        circularQueue.enQueue(5);
        if(!circularQueue.isEmpty()){
            System.out.println("Front : " + circularQueue.front());
            System.out.println("Rear : " + circularQueue.rear());
        }
        System.out.println("Rear : " +circularQueue.rear());
        circularQueue.deQueue();
        circularQueue.front();
        if(!circularQueue.isEmpty()){
            System.out.println("Front : " + circularQueue.front());
        }
        circularQueue.deQueue();
        circularQueue.deQueue();
        circularQueue.deQueue();
    }
}
