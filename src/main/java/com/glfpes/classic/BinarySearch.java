package com.glfpes.classic;

/**
 * binary search
 * time complexity: average o(log n); worst o(log n); best o(1)
 * memory complexity: o(1)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = new int[] {1,3,5,10,11,11,30,102,110};
        int itemToSearch = 111;

        int indexOfItemToSearch = binarySearch(sortedArray, itemToSearch);
        System.out.println(indexOfItemToSearch);
    }

    public static int binarySearch(int[] sortedArray, int itemToSearch) {
        int lowerBound = 0;
        int upperBound = sortedArray.length - 1;
        while (lowerBound < upperBound) {
            int mid = (lowerBound + upperBound) / 2;
            if (itemToSearch > sortedArray[mid]) {
                lowerBound = mid + 1;
            } else if (itemToSearch < sortedArray[mid]) {
                upperBound = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
