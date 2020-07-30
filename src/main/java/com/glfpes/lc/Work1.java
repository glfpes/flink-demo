package com.glfpes.lc;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Work1 {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        int[] nums = {1,3,5,7};
        int target = 4;
        int[] result = twoSumHash(nums, target);
        System.out.println(objectMapper.writeValueAsString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; ++i) {
            int digitX = nums[i];
            for (int j = i + 1; j < nums.length; ++j) {
                int digitY = nums[j];
                if (digitX + digitY == target) {
                    int[] result = {i, j};
                    return result;
                }
            }
        }
        return new int[]{0,1};
    }

    public static int[] twoSumHash(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int dataX = nums[i];
            int dataY = target - dataX;
            if (hashMap.containsKey(dataY)) {
                int j = hashMap.get(dataY);
                return new int[] {j, i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        throw new  IllegalArgumentException("no such results");
    }
}
