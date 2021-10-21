package top.syhan.java.oop.ex;

import javax.swing.*;
import java.awt.*;

/**
 * @program: java-lesson
 * @description:
 * @author: SYH
 * @Create: 2021-10-21 10:48
 **/
public class FrameDemo {
    private static void createAndShowGUI() {

        JFrame frame = new JFrame("JFrame");

        Container contentPane = frame.getContentPane();

        contentPane.setBackground(Color.lightGray);

        JLabel jLabel = new JLabel("这是一个JFrame的窗体");

        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500, 300);

        contentPane.add(jLabel);

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FrameDemo::createAndShowGUI);
    }
}




//public class FrameDemo {
//    public static void main(String[] args) {
//        JFrame f = new JFrame("第一个Swing窗体");
//        f.setSize(500,300);
//        f.setBackground(Color.WHITE);
//        f.setLocation(300,200);
//        JButton jButton1 = new JButton("按钮1");
//        JButton jButton2 = new JButton("按钮2");
//        f.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
//        f.add(jButton1);
//        f.add(jButton2);
//        f.setVisible(true);
//    }
//}