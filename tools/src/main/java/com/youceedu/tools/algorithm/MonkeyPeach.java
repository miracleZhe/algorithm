package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName MonkeyPeach
 * @Description 第二天等于第一天/2 -1 ,第十天 1个桃子
 * @Date 2021/5/11 22:05
 */
public class MonkeyPeach {
    public static void main(String[] args) {
        int count=1;
        for (int day = 10; day >0 ; day--) {
            if (day==10){
                System.out.println("第"+day+"天剩的数量为: "+count);
            }else {
                count=(count+1)*2;
                System.out.println("第"+day+"天剩的数量为: "+count);
            }
        }
    }
}