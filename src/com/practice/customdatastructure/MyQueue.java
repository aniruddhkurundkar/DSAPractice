package com.practice.customdatastructure;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private int start;
    private List<Integer> data;

    public MyQueue(){
        start = 0;
        data = new ArrayList<>();
    }

    public boolean enqueue(int x){
        data.add(x);
        return true;
    }

    public boolean dequeue(){
        if(isEmpty() == true){
            return false;
        }
        start++;
        return true;
    }

    public int getFront(){
        return data.get(start);
    }

    public boolean isEmpty(){
        return start >= data.size();
    }
}
