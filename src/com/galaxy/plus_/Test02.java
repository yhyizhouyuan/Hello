package com.galaxy.plus_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/7 16:22
 */
public class Test02 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++ == 5);
//        System.out.println(++x == 6);

        int a = 3;
        int b = 4;
        int c = 5;
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println(max);
        System.out.println(2 ^ 3);
        System.out.println(2 | 3);
        System.out.println(3 | 5);
        System.out.println(~2);
        System.out.println(~-2);

        char name = '航';
        String allName = "杨"+name;
        System.out.println(allName);
    }
}
