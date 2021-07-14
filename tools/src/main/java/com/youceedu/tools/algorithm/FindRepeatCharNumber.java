package com.youceedu.tools.algorithm;

import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName FindRepeatCharNumber
 * @Description 统计一个字符出现的次数
 * @Date 2021/5/2 22:21
 */
public class FindRepeatCharNumber {
    public static void main(String[] args) {
        String s="asfasfegads";
        char findchar='f';
        //方法1
       int count= StringUtils.countMatches(s,String.valueOf(findchar));
        System.out.println(count);

        //方法2
        Map<Character,Integer>map = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getKey().equals(findchar)){
                System.out.println(entry.getValue());
            }
        }

        //方法3
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map.get(findchar));

    }
}