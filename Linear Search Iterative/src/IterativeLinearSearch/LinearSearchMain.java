/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IterativeLinearSearch;

import static IterativeLinearSearch.LinearSearchClass.linearSearch;

/**
 *
 * @author Ryan Kolbe
 */
public class LinearSearchMain {

    public static void main(String[] args) {
        int[] data = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(linearSearch(data, 7));
    }
}
