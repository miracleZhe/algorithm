package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName PerfectNumber
 * @Description 完数 除它本身外的因子之和
 * @Date 2021/5/3 21:44
 */
public class PerfectNumber {
    public static void main(String[] args) {
        //28
        for (int i = 1; i <1000 ; i++) {
            int sum=0;
            for (int j = 1; j <=i/2 ; j++) {
                if (i%j==0){
                    sum+=j;
                }
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}