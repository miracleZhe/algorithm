package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName Rabbit
 * @Description 斐波那契
 * @Date 2021/5/11 22:02
 */
public class Rabbit {

    public static int getCount(int month){
        int count=0;
        if (month<3){
            count=1;
        }else {
            count=getCount(month-1)+getCount(month-2);
        }

        return count;
    }
    public static void main(String[] args) {

        System.out.println(getCount(12));
    }
}