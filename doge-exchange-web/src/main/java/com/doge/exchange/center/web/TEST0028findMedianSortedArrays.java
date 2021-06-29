package com.doge.exchange.center.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4. 寻找两个正序数组的中位数
 *   二分查找
 *
 */
public class TEST0028findMedianSortedArrays {


    // 寻找两个正序数组的中位数
    public static void main(String[] args) {

//        int[] a = new int[]{1, 3, 4};
//        int[] b = new int[]{5, 6, 7};

        int[] a = new int[]{2,2,4,4};
        int[] b = new int[]{2,2,4,4};

//        int[] a = new int[]{1, 2};
//        int[] b = new int[]{3,4};

//        int[] a = new int[]{2, 3,9};
//         int[] b = new int[]{1};


        BigDecimal divide = new BigDecimal(9).divide(new BigDecimal(2), 1,BigDecimal.ROUND_HALF_UP);

        double medianSortedArrays = findMedianSortedArrays(a, b);
        System.out.println(" [] = "+medianSortedArrays);

    }

    public static double findMedianSortedArrays(int[] n1, int[] n2) {
        int l1 = n1.length;
        int l2 = n2.length;
        double res = 0;
        if (l1 == 0 && l2 > 0) {
            //找l2中位数
            if (l2 % 2 == 0) {
                BigDecimal divide = new BigDecimal(n2[l2 / 2 -1 ] + n2[l2 / 2]).divide(new BigDecimal(2), 2, BigDecimal.ROUND_HALF_UP);
                res = Double.valueOf(divide.toString());
            } else {
                res = n2[l2 / 2];
            }

        }
        if (l1 > 0 && l2 == 0) {
            if (l1 % 2 == 0) {
                BigDecimal divide = new BigDecimal(n1[ l1/ 2-1] + n1[l1/ 2]).divide(new BigDecimal(2), 2, BigDecimal.ROUND_HALF_UP);
                res = Double.valueOf(divide.toString());

            } else {
                res = n1[l1 / 2 ];
            }

        }
        if (l1 > 0 && l2 > 0) {
            //比较 l1头尾  l2头尾的位置



        }
        return res;
    }


}
