package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName PatternCount
 * @Description 统计不同类型字符串个数
 * @Date 2021/5/2 22:37
 */
public class PatternCount {
    public static void main(String[] args) {
        String p1="[\\u4e00-\\u9fa5]";
        String p2="[a-zA-z]";
        String p3="\\s";
        String p4="[0-9]";
        String str="www.youceedu.com 测试 testdev 1";

        //统计
        int countChinese=0;
        int countLetter=0;
        int countSpace=0;
        int countNumber=0;
        int countOther=0;
        String[] array_strings=new String[str.length()];
        for(int i=0;i<str.length();i++){
            array_strings[i]=str.charAt(i)+"";

        }

        for(String s:array_strings){
            if (s.matches(p1)){
                countChinese++;
            }else if(s.matches(p2)){
                countLetter++;
            }else if(s.matches(p3)){
                countSpace++;
            }else if (s.matches(p4)){
                countNumber++;
            }else {
                countOther++;
            }
        }

        System.out.println("中文: "+countChinese+" 英文: "+countLetter+" 数字: "+countNumber+" 空格: "+countSpace+" 其他: "+countOther);


    }
}