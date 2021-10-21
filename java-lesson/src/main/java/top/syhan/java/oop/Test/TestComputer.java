package top.syhan.java.oop.Test;

import top.syhan.java.oop.Test.Computer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: java-lesson1
 * @description:
 * @author: SYH
 * @Create: 2021-10-14 11:18
 **/
public class TestComputer {
    public static void main(String[] args) throws IOException {
        Computer pc = new Computer(
                "MacBook Air", "grey",
                "Intel","8G",
                "256G",7777.77,"开机");
        //从键盘通过输入流接受数据
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请输入0-9:");
        String choice = br.readLine();
        switch(choice) {
            case "1": {
                System.out.println(pc.getBand());
                break;
            }
            case "2": {
                System.out.println(pc.getPrice());
                break;
            }
            case "3": {
                pc.start();
                break;
            }
            case "4": {
                pc.off();
                break;
            }

            default:
                break;
        }
    }
}