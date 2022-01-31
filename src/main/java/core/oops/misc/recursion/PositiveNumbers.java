package core.oops.misc.recursion;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vishnu
 */
public class PositiveNumbers extends Numbers {

    public int addIteration(int start, int end, int except) {
        System.out.println("hit");
        int add = 0;
        for (int j = start; j <= end; j++) {
            add += j;
        }
        return add;
    }

    @Override
    public int addIteration(int start, int end) {
        int add = 0;
        for (int j = start; j <= end; j++) {
            add += j;
        }
        return add;
    }

    public int addRecursion(int start, int end, int limit) {
        if (start == end) {
            return start;
        } else {
            return end + addRecursion(start , end-1);
        }
    }

    public PositiveNumbers() {
        System.out.println("default sub hit");
    }



}
