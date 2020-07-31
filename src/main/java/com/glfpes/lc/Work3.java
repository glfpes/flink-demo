package com.glfpes.lc;

import java.util.HashSet;
import java.util.Set;

public class Work3 {
    public static void main(String[] args) {
        String testString = "au";
        System.out.println(lengthOfLongestSubstring(testString));
    }

    // brutal
    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }
        int result = 0;
        for(int start = 0; start < s.length(); ++start) {
            Set<Character> set = new HashSet<>();
            for (int end = start; end < s.length(); ++end) {
                if (set.contains(s.charAt(end))) {
                    break;
                } else {
                    set.add(s.charAt(end));
                }
                result = Math.max(result, set.size());
            }
        }
        return result;
    }
}
