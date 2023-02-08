package com.galaxy.break_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/8 12:03
 */
public class Test {
    public static void main(String[] args) {
        lable1:
        for (int i = 0; i < 4; i++) {
            lable2:
            for (int j = 0; j < 10; j++) {
                if (j == 2){
//                    continue ;
//                    continue lable2;
                    continue lable1;
                }
                System.out.println("j="+j);
            }
        }
    }
}
