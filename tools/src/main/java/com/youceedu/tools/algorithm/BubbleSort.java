package com.youceedu.tools.algorithm;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName BubbleSort
 * @Description Todo
 * @Date 2021/5/5 21:33
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{6,1,5,234,65,34,100};
        int tmp;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {

                if (arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }

        }
        for (int a:arr) {
            System.out.print(a+" ");
        }
    }
}