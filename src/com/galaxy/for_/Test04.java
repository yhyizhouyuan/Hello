package com.galaxy.for_;

import java.util.Scanner;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 9:47
 */
public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer;
        do {
            System.out.println("小李子使用连环招式逼问");
            System.out.println("还钱还是不还钱y/n");
            answer = scanner.next().charAt(0);
            System.out.println("他的回答是:"+answer);
        }while (answer == 'n');
        System.out.println("还钱了");
    }
}
