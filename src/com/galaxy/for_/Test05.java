package com.galaxy.for_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 9:56
 */
public class Test05 {
    public static void main(String[] args) {
        int row = 9;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +" * " +j +" = "+ (i*j)+"\t");
            }
            System.out.println();
        }
    }
}
