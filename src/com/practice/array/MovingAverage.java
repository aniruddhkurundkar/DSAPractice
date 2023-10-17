package com.practice.array;

public class MovingAverage {

    int size;
    int head = 0;
    int count = 0;
    int sum = 0;
    int[] array;

    public MovingAverage(int size) {
        this.size = size;
        array = new int[size];
    }

    public double next(int val) {
        double avg = 0.0;
        ++count;
        int tail = (head+1)%size;
        sum = sum - array[tail] + val;
        head = (head+1)%size;
        array[head] = val;
        avg = (sum * 1.0)/ Math.min(size,count);
        return avg;
    }

    public static void main(String[] args) {
        MovingAverage avg = new MovingAverage(3);
        avg.next(3);
    }

}
