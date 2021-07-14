package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName Multiply
 * @Description Todo
 * @Date 2021/5/3 21:34
 */
public class Multiply {
    public static void main(String[] args) {
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");

            }
                System.out.println();
        }
    }
}