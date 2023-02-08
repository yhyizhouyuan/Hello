package com.galaxy.for_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 9:06
 */
public class Test01 {
    public static void main(String[] args) {
        int count = 0;
        int totol = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 9 == 0) {
                count++;
            }
            totol += i;
        }
        System.out.println("能被9整除的个数为：" + count);
        System.out.println("总数为：" + totol);
    }
}
