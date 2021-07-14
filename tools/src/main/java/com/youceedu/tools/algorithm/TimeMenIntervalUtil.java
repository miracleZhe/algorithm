package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName TimeMenIntervalUtil
 * @Description Todo
 * @Date 2021/5/2 19:15
 */
public class TimeMenIntervalUtil {
    private static long startTime,endTime,curMem1,curMem2;
    public static void start(){
        startTime=System.currentTimeMillis();
        Runtime runtime=Runtime.getRuntime();
        curMem1= runtime.totalMemory()- runtime.freeMemory();
    }

    public static void end(){
        endTime=System.currentTimeMillis();

        Runtime runtime=Runtime.getRuntime();
        curMem2= runtime.totalMemory()- runtime.freeMemory();
        System.out.printf("代码执行时间为: %d ms,耗损内存为: %d bytes",(endTime-startTime),(curMem2-curMem1));
    }
    public static void main(String[] args) {

    }
}