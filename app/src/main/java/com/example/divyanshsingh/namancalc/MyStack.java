package com.example.divyanshsingh.namancalc;

/**
 * Created by Divyansh Singh on 10-09-2017.
 */

public class MyStack {
    private int maxSize;
    private float[] stackArray;
    private int top;


    public MyStack(int max) {
        maxSize = max;
        stackArray = new float[maxSize];
        top = -1;
    }
    public void push(float j)
    {
        stackArray[++top] = j;
    }
    public float pop() {

        return stackArray[top--];
    }
    public float peek()
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
