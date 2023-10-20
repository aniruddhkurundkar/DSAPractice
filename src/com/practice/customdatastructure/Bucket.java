package com.practice.customdatastructure;

import java.util.LinkedList;

public class Bucket {

    private LinkedList<Integer> list;

    public Bucket(){
        list = new LinkedList<>();
    }

    public void insert(Integer key){
        int index = this.list.indexOf(key);
        if(index == -1){
            this.list.addFirst(key);
        }
    }
    public void remove(Integer key){
        this.list.remove(key);
    }
    public boolean exists(Integer key){
        int index = this.list.indexOf(key);
        return index != -1 ;
    }
}
