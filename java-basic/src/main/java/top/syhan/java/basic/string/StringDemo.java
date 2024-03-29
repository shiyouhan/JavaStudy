package top.syhan.java.basic.string;

import java.util.Scanner;

/**
 * @program: java-basic
 * @description: 字符串练习
 * @author: SYH
 * @Create: 2021-09-24 20:11
 **/

public class StringDemo {
    public static void main(String[] args){
        //获取键盘输入并赋值给s1字符串
        Scanner s1 = new Scanner(System.in);
        System.out.println("请给字符串a赋值: ");
        String a = s1.nextLine();
        Scanner s2 = new Scanner(System.in);
        System.out.println("请给字符串b赋值： ");
        String b = s2.nextLine();
        System.out.println("字符串a的内容: " + a);
        System.out.println("字符串b的内容: " + b);

        //将两个字符串进行比较是否相同
        System.out.println("两字符串内容是否相同？" + a.equals(b));
        //比较两字符串是否同一个对象
        System.out.println(a == b);
        //比较两字符串（忽略大小写）
        System.out.println(a.equalsIgnoreCase(b));
        //将两个字符串相加成为一个新字符串
        String c = a + b;
        System.out.println("字符串a与b合并之后的内容为:" + c);
        //查找某一子字符串是否被包含在此字符串中，如果包含，包含了多少次
        Scanner s3 = new Scanner(System.in);
        System.out.println("请输入想要查找的字符串：");
        String d = s3.nextLine();
        //子字符串是否被包含在此字符串中，包含输出ture,否则输出false
        boolean con = c.contains(d);
        System.out.println("子字符串是否被包含在此字符串中:" + con);
        //调用count，输出包含次数
        System.out.println("包含次数为: " + repetitions(c, d) );
        //将此字符串替换为其他新的指定字符串
        Scanner s4 = new Scanner(System.in);
        System.out.println("请选择是否替换字符（串）:确定(1)/拒绝(2)");
        int e = s4.nextInt();
        switch (e){
            //查询类型1，替换字符（串）后输出
            case 1:
                Scanner s5 = new Scanner(System.in);
                System.out.println("请输入想要替换的原字符: ");
                String f = s5.nextLine();
                Scanner s6 = new Scanner(System.in);
                System.out.println("请输入想要替换的原字符: ");
                String g = s6.nextLine();
                //将f替换为g
                String z = c.replace(f, g);
                System.out.println("替换前: " + c);
                System.out.println("替换后: " + z);
                break;
            //查询类型2，不替换
            case 2:
                System.out.println("最终的字符串内容：\n" + c);
                break;
            default:
                System.out.println("该字符（串）有误");
        }
    }

    private static int repetitions(String c, String d) {
        //创建repetitions统计出现次数
        //创建一个计算器，统计次数
        int count = 0;
        //创建计数器，社开始的地址
        int fromIndex = 0;
        //循环到没有输出-1时就停止循环
        while ((fromIndex = c.indexOf(d, fromIndex)) != -1){
            //子串第一次出现的位置+长度=下一次的起始位置
            fromIndex = fromIndex + d.length();
            count++;
        }
        return  count;
        }
}
