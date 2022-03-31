package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = fillArray();
        long time = System.currentTimeMillis();
        System.out.print("BinarySearch: " + BinarySearch.binarySearch(array, 445268) + " time: ");
        System.out.println(System.currentTimeMillis() - time);
        System.out.print("BinarySearchRecursive: " + BinarySearch.recursiveBinarySearch(array, 0, array.length, 445268) + " time: ");
        System.out.println(System.currentTimeMillis() - time);
        System.out.print("LinearSearch: " + LinearSearch.linearSearch(array, 445268) + " time: ");
        System.out.println(System.currentTimeMillis() - time);
        System.out.print("JumpSearch: " + JumpSearch.jumpSearch(array, 445268) + " time: ");
        System.out.println(System.currentTimeMillis() - time);
    }

    private static int[] fillArray() {
        int[] array = new int[5000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
