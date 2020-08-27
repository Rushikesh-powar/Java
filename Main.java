package com.rushi.practice;
import com.sun.jdi.IntegerValue;

import java.util.*;

public class Main {
    /** Accepts any Datatype value to print*/
    public static void print(Object... s){
        for (Object val : s){
            System.out.print(val.toString());
        }
    }

    ///main function.
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);

        Map m = new TreeMap();
        int value = 0;
        String[] arr = {"a", "b", "c", "a", "d", "e", "b", "c", "a", "e", "d"};

        for (String val: arr){
            if (m.containsKey(val)){
                value = Integer.parseInt(m.get(val).toString());
                value++;
                m.replace(val, value);
                print(m, "\n");
            }
            else
                m.put(val, 0);
        }

        print("Final Iteration: ");
        print(m);

        input.close();
    }
}
