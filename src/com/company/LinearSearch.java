package com.company;

public class LinearSearch {

  public static int linearSearch(int array[], int searchElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchElement)
                return i;
        }
        return -1;
    }
}
