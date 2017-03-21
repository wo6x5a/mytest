package com.lcw.leetcode.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific
 * target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * 
 * @author chenwulou
 *
 */
public class Solution {

    /**
     * Example: Given nums = [2, 7, 11, 15], target = 9,
     * 
     * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
     * 
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] resp = new int[2];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (target == nums[i] + nums[j]) {
                    resp[0] = i;
                    resp[1] = j;
                    return resp;

                }
            }
        }
        return resp;

    }

    public static int[] reference(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]) - 1;
                return result;
            }
            map.put(nums[i], i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] req = {2, 7, 11, 15};
        int target = 9;
        twoSum(req, target);
        // reference(req, target);
    }
}
