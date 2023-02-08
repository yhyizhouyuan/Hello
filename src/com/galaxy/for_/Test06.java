package com.galaxy.for_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 10:02
 */
public class Test06 {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= row - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || i == row || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();
        }
    }
}
