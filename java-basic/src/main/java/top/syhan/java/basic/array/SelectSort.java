package top.syhan.java.basic.array;

import lombok.extern.slf4j.Slf4j;

/**
 * @program: java-basic
 * @description: 选择顺序
 * @author: SYH
 * @Create: 2021-10-04 18:58
 **/
@Slf4j
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80,57,13};
        selectSort(arr);
    }

    public static void selectSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for(int j :arr){
            log.info(j + " ");
        }
    }
}
