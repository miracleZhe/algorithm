package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName RecursionAge
 * @Description 第一个人 10岁
 *              第二个比第一个大2岁
 *              第三个比第二个大2岁
 * @Date 2021/5/11 21:57
 */
public class RecursionAge {
    public static int getAge(int p){
        int age = 0;
        if (p==1){
            age= 10;

        }else{
            age= getAge(p-1)+2;
        }
            return age;
    }

    public static void main(String[] args) {

        System.out.println(getAge(5));
    }
}