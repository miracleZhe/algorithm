package com.youceedu.tools.algorithm;

import java.util.Arrays;

/**
 * @author wangzhe
 * @version V1.0
 * @ClassName BinarySearch
 * @Description Todo
 * @Date 2021/5/5 21:59
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr=new int[]{6,1,5,234,65,34,100};
        int findNum=5;
        //方法1
        int index= Arrays.binarySearch(arr,findNum);

        //方法2
        int start=0;
        int end=arr.length-1;
        while(true){
            int mid=(start+end)/2;
            if(findNum==arr[mid]){
             System.out.println("index: "+mid);
             break;
            }else if (findNum>arr[mid]){
                start=mid+1;
            }
            else if (findNum<arr[mid]){
                end=mid-1;
            }
        }
    }
}