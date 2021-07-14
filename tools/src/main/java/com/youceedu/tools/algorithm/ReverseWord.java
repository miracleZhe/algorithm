package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName ReverseWord
 * @Description 翻转字符串
 * @Date 2021/5/2 22:05
 */
public class ReverseWord {
    public static void main(String[] args) {
        String s="youceedu";
        //方法1
        StringBuilder stringBuilder=new StringBuilder(s);
        String reverse=stringBuilder.reverse().toString();
        System.out.println(reverse);

        //方法2
        char[] chars=s.toCharArray();
        String result="";
        for (int i=chars.length-1;i>=0;i--){
            result +=chars[i];
        }
        System.out.println(result);

        //方法3
        String result2="";
        for (int j=0;j<s.length();j++){
            result2=s.charAt(j)+result2;
        }
        System.out.println(result2);
    }
}