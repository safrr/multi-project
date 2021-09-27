package com.safronova.core;

import com.safronova.util.StringUtils;

import java.util.Arrays;

public class Utils {
    private Utils(){

    }
    public static boolean isAllPositiveNumbers(String ... str){
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
