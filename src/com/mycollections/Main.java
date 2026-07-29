/**
 *  Java program to demonstrate HashMap usage.
 */

package com.mycollections;

import java.util.HashMap;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating a HashMap instance.
        HashMap<Integer, Double> myMap = new HashMap<>();

        // Adding elements.
        myMap.put(3, 5.4);
        myMap.put(4, 9.3);
        myMap.put(8, 8.1);
        myMap.put(9, 2.4);
        myMap.put(11, 0.2);
        myMap.put(1, 0.36);
        myMap.put(2, 10.36);
        myMap.put(5, 11.86);

        // Printing values of myMap.
        System.out.println(myMap); // Output: {1=0.36, 2=10.36, 3=5.4, 4=9.3, 5=11.86, 8=8.1, 9=2.4, 11=0.2}

        // Get.
        System.out.println("Number 2 is " + myMap.get(2)); // Output: Number 2 is 10.36
        System.out.println("Number 1 is " + myMap.get(1)); // Output: Number 1 is 0.36
        System.out.println("Number 11 is " + myMap.get(11)); // Output: Number 11 is 0.2


        System.out.println("All elements: ");
        // Iterating through population HashMap.
        for (Integer element : myMap.keySet()) {
            System.out.println(myMap.get(element));
        }

        // Size.
        System.out.println("Size of map is " + myMap.size()); // Output: Size of map is 8

    }
}