package com.company;

public class JumpSearch {

    public static int jumpSearch(int[] array, int searchElement) {

        int arrayLength = array.length;
        int jumpStep = (int) Math.sqrt(array.length);
        int previousStep = 0;

        while (array[Math.min(jumpStep, arrayLength) - 1] < searchElement) {
            previousStep = jumpStep;
            jumpStep += (int) (Math.sqrt(arrayLength));
            if (previousStep >= arrayLength)
                return -1;
        }
        while (array[previousStep] < searchElement) {
            previousStep++;
            if (previousStep == Math.min(jumpStep, arrayLength))
                return -1;
        }

        if (array[previousStep] == searchElement)
            return previousStep;
        return -1;
    }
}
