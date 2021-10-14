package top.syhan.java.basic.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @program: java-basic
 * @description: 直接插入排序
 * @author: SYH
 * @Create: 2021-10-05 18:53
 **/
@Slf4j
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        log.info("排序之前: {}", Arrays.toString(arr));
        //调用直接插入排序
        insertSort(arr);
        log.info("排序之后: {}", Arrays.toString(arr));
    }

    public static void insertSort (int[] arr){
        //已排序数组的下标
        int j;
        //待排序元素
        int t;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i - 1]){
                //赋值给排序元素
                t = arr[i];
                for(j = i - 1; j >= 0 && arr[j] > t; j--){
                    //从后往前遍历，逐个和待排序元素比较，如果已排序元素较大，则将它后移
                    arr[j + 1] = arr[j];
                }
                //讲待排序元素输入正确的位置
                arr[j + 1] = t;
            }
        }
    }
}
