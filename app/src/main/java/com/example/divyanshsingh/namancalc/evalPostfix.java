package com.example.divyanshsingh.namancalc;

/**
 * Created by Divyansh Singh on 10-09-2017.
 */

public class evalPostfix {
    MyStack list;
    private String input;
    public evalPostfix(String in) {
        input = in;
        int stackSize = in.length();
        list = new MyStack(stackSize);
    }

    public  float calc() {

        float res = 0;

        float n1;     //result of 1st popping
        float n2;     // result of 2nd popping


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);



            if (ch == ' ') {
                continue;
            } else {
                if (ch > '0' && ch <= '9') {
                    list.push(Character.getNumericValue(ch));

                } else {
                    n1 = (float) list.pop();
                    n2 = (float) list.pop();
                    //n1 = float.parseFloat("" + list.pop());
                    //n2 = float.parseFloat("" + list.pop());

                    switch (ch) {
                        case '+':

                            list.push(n1 + n2);
                            break;
                        case '-':

                            list.push(n2 - n1);
                            break;
                        case '*':

                            list.push(n1 * n2);
                            break;
                        case '/':

                            list.push(n2 / n1);
                            break;

                        default:

                    }
                }
            }
        }

        //res = float.parseFloat("" + list.pop());
        res = (float) list.pop();
        return res;
    }
}