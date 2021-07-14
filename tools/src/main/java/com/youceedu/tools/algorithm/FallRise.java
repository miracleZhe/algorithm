package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName FallRise
 * @Description 一个球第x次反弹多高
 * @Date 2021/5/5 22:13
 */
public class FallRise {
    public static void main(String[] args) {
        int height=100;
        int meterCount=0;
        int x=5;
        for (int i = 1; i <=3 ; i++) {
            meterCount=meterCount+height;
            height=height/2;
        }
        System.out.println("rise: "+meterCount+" height: "+height);
    }
}