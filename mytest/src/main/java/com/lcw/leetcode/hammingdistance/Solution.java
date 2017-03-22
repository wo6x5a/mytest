package com.lcw.leetcode.hammingdistance;

/**
 * 
 * The Hamming distance between two integers is the number of positions at which the corresponding
 * bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance. 0 ≤ x, y < 231.
 * 
 * @author chenwulou
 *
 */
public class Solution {

    /**
     * 
     * Input: x = 1, y = 4
     * 
     * Output: 2
     * 
     * Explanation: 1 (0 0 0 1) 
     *              4 (0 1 0 0) 
     *                   ↑   ↑
     * 
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        hammingDistance(1, 16);
    }
}
