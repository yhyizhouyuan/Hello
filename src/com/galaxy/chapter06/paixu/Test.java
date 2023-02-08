package com.galaxy.chapter06.paixu;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 16:55
 */
public class Test {
    public static void main(String[] args) {
        int [] arr = {23,44,45,65,4,6};
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
//            temp = arr[arr.length-1-i];
//            arr[arr.length-1-i]=arr[i];
//            arr[i] = temp;
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
