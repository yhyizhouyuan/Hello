package com.galaxy.for_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 10:51
 */
public class Test07 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (count >=20){
                System.out.println("当前数大于二十");
                System.out.println("当前数："+i);
                break;
            }
            count +=i;
        }
        System.out.println("当前总和："+count);
    }
}
