package com.company;

public class BinarySearch {


    public static int binarySearch(int array[], int searchElement) {

        int firstIndex = 0;
        int lastIndex = array.length - 1;


        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;

            if (array[middleIndex] == searchElement) {
                return middleIndex;

            } else if (array[middleIndex] < searchElement) {
                firstIndex = middleIndex + 1;

            } else if (array[middleIndex] > searchElement) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int array[], int firstElement, int lastElement, int searchElement) {


        if (lastElement >= firstElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;


            if (array[mid] == searchElement) {
                return mid;
            }

            if (array[mid] > searchElement) {
                return recursiveBinarySearch(array, firstElement, mid - 1, searchElement);
            }

            return recursiveBinarySearch(array, mid + 1, lastElement, searchElement);
        }

        return -1;
    }
}
