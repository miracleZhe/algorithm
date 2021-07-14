package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName Factorial
 * @Description 阶乘
 * @Date 2021/5/3 21:21
 */
public class Factorial {
    public static int factorial(int num){
        if(num==1){
            return 1;
        }

        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}