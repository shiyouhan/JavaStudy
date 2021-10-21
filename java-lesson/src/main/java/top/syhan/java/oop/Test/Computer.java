package top.syhan.java.oop.Test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-14 11:17
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Computer {
    private String band;
    private String color;
    private String cpu;
    private String memory;
    private String hardDisk;
    private Double price;
    private String workStatus;

    public void start() {
        System.out.println("开机");
    }

    public void off() {
        System.out.println("关机");
    }
}
