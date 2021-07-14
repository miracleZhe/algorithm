package com.youceedu.tools.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName FirstUniqChar
 * @Description 只出现一次的第一个字符串
 * @Date 2021/5/2 20:17
 */
public class FirstUniqChar {
    public static void main(String[] args) {
        TimeMenIntervalUtil.start();
        String s="aabbccd";
        Map<Character,Integer> map =new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            /*
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
             */
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<s.length();j++){
            if(map.get(s.charAt(j))==1){
                System.out.println("输出结果: "+s.charAt(j));
                break;
            }
        }
        TimeMenIntervalUtil.end();

    }

}