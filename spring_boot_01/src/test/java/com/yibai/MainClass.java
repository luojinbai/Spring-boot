package com.yibai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by yibai on 2018-12-30.
 */
public class MainClass {

    private static List<Double> list = Arrays.asList(19488.08, 20328.08, 21168.08, 22008.08, 22848.08, 23688.08, 24821.45, 25661.45, 28421.45, 30221.45, 32021.45, 33821.45);

    static double last = 33821.45;

    public static void main(String[] args) {
//        System.out.println(doubleList);


        ArrayList<Double> doubleList = new ArrayList<>(list);


        doubleList.remove(0);
        doubleList.remove(0);
        doubleList.add(last + 1800 * 1);
        doubleList.add(last + 1800 * 2);
        System.out.println(doubleList);

        double compute = compute(doubleList);
        System.out.println(compute);

        System.out.println("===========================");

        ArrayList<Double> doubleList2 = new ArrayList<>(list);
        System.out.println(change(doubleList2, 5));
        ;

    }


    private static double change(List<Double> list, int index) {

        ArrayList<Double> doubleArrayList = new ArrayList<>(list);

        int ii = index;
        while (ii-- > 0) {
            doubleArrayList.remove(0);
        }
        for (int a = 0; a < index; a++) {
            doubleArrayList.add(last + 1800 * (index - a));
        }
        Collections.sort(doubleArrayList);
        System.out.println(doubleArrayList);
        return compute(doubleArrayList);
    }


    private static double compute(List<Double> doubleList) {
        double sum = 0;
        for (double d : doubleList) {
            sum += d;

        }
        double v = sum / 12;
        System.out.println(v);
        return v * 15;

    }

}
