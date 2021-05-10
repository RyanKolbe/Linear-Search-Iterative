/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeLinearSearch;

/**
 *
 * @author Ryan Kolbe
 */
public class LinearSearchClass {

    public static int linearSearch(int[] data, int target) {
        int position = -1;
        boolean found = false;
        int n = data.length;
        for (int i = 0; i < n && !found; i++) {
            if (data[i] == target) {
                found = true;
                position = i;
            }
        }
        return position;
    }
}
