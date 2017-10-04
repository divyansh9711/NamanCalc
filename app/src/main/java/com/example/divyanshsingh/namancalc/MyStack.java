package com.example.divyanshsingh.namancalc;

/**
 * Created by Divyansh Singh on 10-09-2017.
 */

public class MyStack {
    private int maxSize;
    private double[] stackArray;
    public int top;


    public MyStack(int max) {
        maxSize = max;
        stackArray = new double[maxSize];
        top = -1;
    }
    public void push(double j)
    {
        stackArray[++top] = j;
    }
    public double pop() {

        return stackArray[top--];
    }
    public double peek()
    {
        return stackArray[top];
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
//    public void push(char j) {
//        stackArray[++top] = j;
//    }
}
