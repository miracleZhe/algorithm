package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName ShowPrimeNumber
 * @Description 素数
 * @Date 2021/5/3 20:57
 */
public class ShowPrimeNumber {

    public static void main(String[] args) {
        /*判断素数
        int num=10;
        boolean flag= true;
        for (int i = 2; i <=num/2 ; i++) {
            if(num%i==0){
                flag=false;
                break;;
            }

        }
    if (flag){
        System.out.println(num+" 是素数");
    }else {
        System.out.println(num+" 不是素数");
    }
    */
    //100以内素数
        for (int i = 2; i <=100 ; i++) {
            boolean flag=true;
            for (int j = 2; j <=i/2 ; j++) {
                if (i%j==0){
                    flag=false;
                    break;
                }

            }
            if (flag){
                System.out.print(i+" ");
            }

        }



    }

}