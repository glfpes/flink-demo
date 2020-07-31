package com.glfpes.classic;

public class ClasicBinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = new int[] {1,3,5,10,11,11,30,102,110};
        int itemToSearch = 9;

        int indexOfItemToSearch = binarySearch(sortedArray, itemToSearch);
        System.out.println(indexOfItemToSearch);
    }

    // todo 存在bug
    public static int binarySearch(int[] sortedArray, int itemToSearch) {
        int lowerBound = 0;
        int upperBound = sortedArray.length;
        while (lowerBound < upperBound) {
            int testIndex = (lowerBound + upperBound) / 2;
            if (sortedArray[testIndex] == itemToSearch) {
                return testIndex;
            } else if (itemToSearch < sortedArray[testIndex]) {
                upperBound = testIndex;
            } else {
                lowerBound = testIndex;
            }
        }
        return -1;
    }

}
