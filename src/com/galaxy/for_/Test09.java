package com.galaxy.for_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 16:44
 */
public class Test09 {
    public static void main(String[] args) {
//        char c = 'A';
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c+"\t");
        }

        for (int i = 97; i < 'z'; i++) {
            System.out.print((char)i+"\t");
        }
    }
}
