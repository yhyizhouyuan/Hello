package com.galaxy.break_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 12:12
 */
public class Test02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i==3) {
                System.out.println("hello,galaxy,"+i);
//                return;
//                continue;
                break;
            }
            System.out.println(i);
        }
    }
}
