package com.rushi.practice;
import com.sun.jdi.IntegerValue;

import java.util.*;

public class Main {
    // i am very lazy to type System.out.println(), that's why i created this function.
    /** Accepts any Datatype value to print*/
    public static void print(Object... s){
        for (Object val : s){
            System.out.print(val.toString());
        }
    }

    ///main function.
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        
        //creating the instace of Map.
        Map m = new TreeMap();
        
        int value = 0;
        int count = 1;
        
        String[] arr = {"a", "b", "c", "a", "d", "e", "b", "c", "a", "e", "d"};
           
        //iterating through every element in the array.
        for (String val: arr){
            // checking if the given element is present in the array.
            if (m.containsKey(val)){
                
                //getting the KeyValue( no of time repeated ) for string.
                value = Integer.parseInt(m.get(val).toString());
                value++;
                
                //replacing it new value.
                m.replace(val, value);
                
                // printing every iterations after finding duplicate strings.
                print("Iteration ", count++, " : ");
                print(m, "\n");
            }
            // if the element is not present in the Map then add it.
            else
                m.put(val, 0);
        }
        
        print("\nFinal Iteration: ");
        print(m);

        input.close();
    }
}
