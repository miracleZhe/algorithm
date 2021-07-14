package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName lengthOfLastWord
 * @Description 求最后一个单词的长度
 * @Date 2021/5/2 20:36
 */
public class lengthOfLastWord {
    public static void main(String[] args) {
        String s="hello youceedu testdev";
        /*方法1
        s.trim();
        int last=s.lastIndexOf(" ")+1;
        System.out.println(s.substring(last).length());
        */

        //方法2
        int count=0;
        s=s.trim();
        int max=s.length();
        for(int i=max-1;i>=0;i--){
            if (s.charAt(i)==' '){
                break;
            }
            count++;
        }
        System.out.println("最后一个词的长度"+count);
    }
}