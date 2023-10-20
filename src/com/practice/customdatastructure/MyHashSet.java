package com.practice.customdatastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {

    int keyRange;
    Bucket[] bucketArray;
    public MyHashSet() {
        keyRange = 100001;
        bucketArray = new Bucket[this.keyRange];
        for(int i=0; i<this.keyRange; ++i){
            this.bucketArray[i] = new Bucket();
        }
    }

    int getHashValue(int key){
        return key%keyRange;
    }
    public void add(int key) {
        int bucketIndex = this.getHashValue(key);
        this.bucketArray[bucketIndex].insert(key);
    }

    public void remove(int key) {
        int bucketIndex = this.getHashValue(key);
        this.bucketArray[bucketIndex].remove(key);
    }

    public boolean contains(int key) {
        int bucketIndex = this.getHashValue(key);
        return this.bucketArray[bucketIndex].exists(key);
    }

}

