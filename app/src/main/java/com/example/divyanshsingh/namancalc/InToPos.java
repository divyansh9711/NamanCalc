package com.example.divyanshsingh.namancalc;

/**
 * Created by Divyansh Singh on 10-09-2017.
 */

//public class InToPos {
//    private Stack theStack;
//    private String input;
//    private String output = "";
//
//    public InToPos(String in) {
//        input = in;
//        int stackSize = input.length();
//        theStack = new Stack(stackSize);
//    }
//
//    public String doTrans() {
//        for (int j = 0; j < input.length(); j++) {
//            char ch = input.charAt(j);
//            switch (ch) {
//                case '+':
//                case '-':
//                    gotOper(ch, 1);
//                    break;
//                case '*':
//                case '/':
//                    gotOper(ch, 2);
//                    break;
//                case '(':
//                    theStack.push(ch);
//                    break;
//                case ')':
//                    gotParen(ch);
//                    break;
//                default:
//                    output = output + ch;
//                    break;
//            }
//        }
//        while (!theStack.isEmpty()) {
//            output = output + theStack.pop();
//        }
//        System.out.println(output);
//        return output;
//    }
//
//    public void gotOper(char opThis, int prec1) {
//        while (!theStack.isEmpty()) {
//            char opTop = theStack.pop();
//            if (opTop == '(') {
//                theStack.push(opTop);
//                break;
//            } else {
//                int prec2;
//                if (opTop == '+' || opTop == '-')
//                    prec2 = 1;
//                else
//                    prec2 = 2;
//                if (prec2 < prec1) {
//                    theStack.push(opTop);
//                    break;
//                } else output = output + opTop;
//            }
//        }
//        theStack.push(opThis);
//    }
//
//    public void gotParen(char ch) {
//        while (!theStack.isEmpty()) {
//            char chx = theStack.pop();
//            if (chx == '(')
//                break;
//            else output = output + chx;
//        }
//    }
//}

import java.util.ArrayList;

public class InToPos {

    private Stack theStack;
    private String input;
    private String output = "";
    public ArrayList<Integer> arr = new ArrayList<Integer>();

    public int k = 0;
    public InToPos(String in) {
        input = in;
        int stackSize = input.length();
        System.out.println("creating stack in intopos lengh"+stackSize);
        theStack = new Stack(stackSize);
    }

    public String doTrans() {
        int count = 0;
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    arr.add(k,count);
                    count = 0;
                    k++;
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    arr.add(k,count);
                    count = 0;
                    k++;
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
//                    if(k >0)
//                    {
//                        float j = (float) output[];
//
//                    }
                    output = output + ch;
                    count++;

                    break;
            }
        }
        while (!theStack.isEmpty()) {
            arr.add(k,count);
            output = output + theStack.pop();
        }
        System.out.println(output);
        return output;
    }

    private void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-')
                    prec2 = 1;
                else
                    prec2 = 2;
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else output = output + opTop;
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(')
                break;
            else output = output + chx;
        }
    }
}
