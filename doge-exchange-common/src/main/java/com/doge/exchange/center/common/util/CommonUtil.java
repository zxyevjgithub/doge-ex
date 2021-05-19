package com.doge.exchange.center.common.util;

import java.security.SecureRandom;

/**
 * @description:
 * @auther: Antonidas
 * @date: 2021/4/14、15:22
 */
public class CommonUtil {


    private static String getRandom(int length) {
        SecureRandom r = new SecureRandom();
        String s = "";
        for (int i = 0; i < length; i++) {
            s += String.valueOf(r.nextInt(10));
        }
        return s;
    }

}