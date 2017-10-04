package com.example.divyanshsingh.namancalc;

/**
 * Created by Divyansh Singh on 10-09-2017.
 */

//public class evalPostfix {
//    MyStack list;
//    private String input;
//    public evalPostfix(String in) {
//        input = in;
//        int stackSize = in.length();
//        list = new MyStack(stackSize);
//    }
//
//    public  float calc() {
//
//        float res = 0;
//
//        float n1;     //result of 1st popping
//        float n2;     // result of 2nd popping
//
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//
//
//
//            if (ch == ' ') {
//                continue;
//            } else {
//                if (ch > '0' && ch <= '9') {
//                    list.push(Character.getNumericValue(ch));
//
//                } else {
//                    n1 = (float) list.pop();
//                    n2 = (float) list.pop();
//                    //n1 = float.parseFloat("" + list.pop());
//                    //n2 = float.parseFloat("" + list.pop());
//
//                    switch (ch) {
//                        case '+':
//
//                            list.push(n1 + n2);
//                            break;
//                        case '-':
//
//                            list.push(n2 - n1);
//                            break;
//                        case '*':
//
//                            list.push(n1 * n2);
//                            break;
//                        case '/':
//
//                            list.push(n2 / n1);
//                            break;
//
//                        default:
//
//                    }
//                }
//            }
//        }
//
//        //res = float.parseFloat("" + list.pop());
//        res = (float) list.pop();
//        return res;
//    }
//}
import java.util.ArrayList;

public class evalPostfix {
    MyStack list ;
    public  String input;

    public evalPostfix(String in) {
        input = in;
        System.out.println("creating stack in eval of size"+ in.length() );
        int stackSize = in.length();
        list = new MyStack(stackSize);
        // list.push(-999);
    }
    public  double calc(ArrayList noOfInt,int index) {

        double res = 0;int loop = 0,jj =0;

        int z = 1;
        double n1;     //result of 1st popping
        double n2;     // result of 2nd popping


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

//            System.out.println(ch);

            if (ch == ' ') {
                continue;
            }
            else {
                if (ch >= '0' && ch <= '9') {
                    if(list.top == -1){
                        list.push(Character.getNumericValue(ch));
                    }
                    else{
                        double temp = list.pop(),temp1 = temp;
                        int j = 1;
                        boolean boo = true;

                        while((int)temp1/10 > 0){
                            temp1 = temp1/10;
                            ++j;
                        }
                        if(j == (int)noOfInt.get(jj) && jj <= index){
                            list.push(temp);jj++;
                            list.push(Character.getNumericValue(ch));
                        }
                        else{
                            for(loop = 0;loop < 1  ;loop++) {
                                double temp2 = Character.getNumericValue(ch);
                                double temp3 = temp *10 + temp2;
                                list.push(temp3);
                            }
                        }
                    }
                }
                else {
                    z = 0;
                    // n1 = (int)list.pop();
                    n1 = (double) list.pop();
                    n2 = (double) list.pop();

                    //n1 = Integer.parseInt("" + list.pop());
                    //n2 = Integer.parseInt("" + list.pop());
                    //                  System.out.println("n1: " + n1 + " n2: " + n2);
                    switch (ch) {
                        case '+':
                            double a = n1+n2;
                            //System.out.println("pushin"+a);
                            list.push(n1 + n2);
                            break;
                        case '-':
                            a = n1-n2;
                            System.out.println("pushin"+a);
                            list.push(n2 - n1);
                            break;
                        case '*':
                            a = n1*n2;
                            System.out.println("pushin"+a);
                            list.push(n1 * n2);
                            break;
                        case '/':
                            a = n1/n2;
                            System.out.println("pushin"+a);
                            if(n2 == 0)
                                return 3.14;
                            list.push(n2/ n1);
                            break;

                        default:
                            System.out.println("Invalid operator order!");
                    }
                }
            }
        }

        res = (double) list.pop();

        return res;
    }
}
