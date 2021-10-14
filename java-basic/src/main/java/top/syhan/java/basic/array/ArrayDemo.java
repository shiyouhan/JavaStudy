package top.syhan.java.basic.array;

/**
 * @program: java-basic
 * @description:
 * @author: SYH
 * @Create: 2021-09-30 08:27
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        char[][] arr1 = new char[4][5];
        arr1[0] = new char[] { '春','眠','不','觉','晓'};
        arr1[1] = new char[] { '处','处','闻','啼','鸟'};
        arr1[2] = new char[] { '夜','来','风','雨','声'};
        arr1[3] = new char[] { '花','落','知','多','少'};
        System.out.println("-----横版-----\n");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length + 1; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            if (i % 2 == 0) {
                System.out.println(",");
            } else {
                System.out.println("。");
            }
        }
        System.out.println("\n-----竖版-----\n");
        for (int j = 0; j < arr1.length + 1; j++) {
            for (int i = arr1.length -1; i >= 0 ;i--) {
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println(" ， 。 ， 。");
    }
}

