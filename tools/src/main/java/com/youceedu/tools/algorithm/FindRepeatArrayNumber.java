package com.youceedu.tools.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName FindRepeatArrayNumber
 * @Description 重复的字符串以及出现次数
 * @Date 2021/5/2 19:03
 */
public class FindRepeatArrayNumber {
    public static void main(String[] args) {
        TimeMenIntervalUtil.start();
        int[] nums=new int[]{1,3,5,7,9,11,9,7,5};

        //定义map存储重复的数字及次数
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else {
                map.put(num,1);
            }
        }

        //输出重复的数字及重复的次数
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>1){
                System.out.printf("重复的数字: %d,重复的次数: %d",entry.getKey(),entry.getValue());
            }
        }
        //时间及内存耗用输出
        TimeMenIntervalUtil.end();

    }
}