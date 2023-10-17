package com.practice.customdatastructure;

import java.util.ArrayList;
import java.util.List;

public class MyCircularQueue {
    int size;
    int[] data;
    int front;
    int rear;

    public MyCircularQueue(int k) {
        size = k;
        data = new int[k];
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%size;
        data[rear] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        if(front == rear){
            front = -1;
            rear = -1;
            return true;
        }
        front = (front+1)%size;
        //size--;
        return true;
    }

    int front() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[front];
        }
    }

    int rear() {
        if (isEmpty()) {
            return -1;
        } else {
            return data[rear];
        }
    }


    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return ((rear+1) % size) == front;
        //return size == data.length;
    }

}
