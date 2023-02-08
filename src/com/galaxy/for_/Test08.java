package com.galaxy.for_;

import javax.swing.*;
import java.util.Scanner;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 10:56
 */
public class Test08 {
    public static void main(String[] args) {
        int num = 3;
        int change = 3;
        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        for (int i = 1; i <= num; i++) {
            System.out.println("请输入用户名：");
            username = scanner.next();

            System.out.println("请输入密码：");
            password = scanner.next();

//            if ("yanghang".equals(username)&&"123".equals(password)){
//                System.out.println("login success");
//                break;
//            }else {
//                System.out.println("login failed,you only have:"+(3-i)+" chance to login");
//            }
            if ("yang".equals(username) && "23".equals(password)) {
                System.out.println("login success");
                break;
            }
            change--;
            System.out.println("login failed,you only have:" + change + " chance to login");
        }
    }
}
