package com.youceedu.tools.algorithm;

import org.apache.commons.lang.ArrayUtils;
import org.apache.poi.util.ArrayUtil;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName TwoSum
 * @Description 求两个数之和等于目标数
 * @Date 2021/5/2 19:40
 */
public class TwoSum {
    public static void main(String[] args) {

        TimeMenIntervalUtil.start();
        int[] num = new int[]{1, 2,5,7, 8, 10};
        int target = 12;
        //有序数组 方法一 双下标
        int i = 0;
        int j = num.length - 1;
        while (i<j) {
            int result = num[i] + num[j];
            if (result == target) {
                System.out.printf("%d,%d\n", num[i], num[j]);
                i++;
            } else if (result > target) {
                j--;
            } else if (result < target) {
                i++;
            }
        }
        //有序数组方法 2 pom.xml/common
            for(int k=0;k<num.length;k++){
                int value=target-num[k];
                if(ArrayUtils.contains(num,value)){
                    System.out.printf("%d,%d\n",num[k],value);
                }
            }
            TimeMenIntervalUtil.end();

    }
}