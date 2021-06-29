package com.doge.exchange.center.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4. 寻找两个正序数组的中位数
 *   执行用时：26 ms
 * , 在所有 Java 提交中击败了  5.04%
 * 的用户 内存消耗： 40.1 MB  在所有 Java 提交中击败了  5.05%
 * 的用户
 *
 */
public class TEST0611findMedianSortedArrays {


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

            //合并数组
            ArrayList<Integer> objects = new ArrayList<>();
            int[] array = new int[n2.length+n1.length];

            int[] bpos = new int[n2.length];
            int[] apos = new int[n1.length];

//            for (int a = 0; a < l1; ++a) {
            int a = 0;
            int cnt = 0;
            while ( apos[n1.length-1] !=-1 ){

                if(apos[a] != 0){
                    continue;
                }
                for (int b = 0; b < l2; ++b) {
                    if (bpos[b] == -1) {
                        continue;
                    }

                    if (n1[a] > n2[b]) {
                        //aa
//                        objects.add(n2[b]);
                        array[cnt] = n2[b];
                        cnt++;
//                        n2[b] = -1;
                        bpos[b] = -1;

                        break;
                    } else if (n1[a] == n2[b]) {

//                        objects.add(n1[a]);
//                        objects.add(n2[b]);
                        array[cnt] = n2[b];
                        cnt++;
                        array[cnt] = n1[a];
                        cnt++;
                        bpos[b] = -1;
                        apos[a] = -1;
                        if(a+1 == n1.length){

                        }else {
                            a++;
                        }
                        break;
                    } else {

//                        objects.add(n1[a]);
                        array[cnt] = n1[a];
                        cnt++;
                        apos[a] = -1;
                        if(a+1 == n1.length){

                        }else {
                            a++;
                        }
                        break;
                    }

                }
                if (apos[a] !=-1 && bpos[n2.length - 1] == -1) {
//                    objects.add(n1[a]);

                    for (int k = 0; k < l1; k++) {
                        if (apos[k] == -1) {
                            continue;
                        }
//                        objects.add(n1[k]);
                        array[cnt] = n1[k];
                        cnt++;

                    }
                    break;
                }


            }
            for (int k = 0; k < l2; k++) {
                if (bpos[k] == -1) {
                    continue;
                }
//                objects.add(n2[k]);
                array[cnt] = n2[k];
                cnt++;
            }

//            int[] ccc = new int[objects.size()];
//            objects.forEach( cc -> System.out.print(cc.toString()));
//            int tt = 0;
//            for (Integer object : objects) {
//
//                ccc[tt] = object.intValue();
//                tt++;
//            }

            int lc = array.length;
            Arrays.stream(array).forEach( d -> System.out.print(d));
            if (lc % 2 == 0) {


                BigDecimal divide = new BigDecimal(array[lc / 2 - 1] + array[lc / 2]).divide(new BigDecimal(2), 2, BigDecimal.ROUND_HALF_UP);
                res = Double.valueOf(divide.toString());
            } else {
                BigDecimal divide = new BigDecimal(array[lc / 2]);
                res = Double.valueOf(divide.toString());

            }

        }
        return res;
    }


}
