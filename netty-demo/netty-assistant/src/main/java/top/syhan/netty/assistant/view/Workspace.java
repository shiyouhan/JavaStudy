package top.syhan.netty.assistant.view;

import top.syhan.netty.assistant.client.NettyClient;
import top.syhan.netty.assistant.util.PropertyUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @program: netty-assistant
 * @description:
 * @author: SYH
 * @Create: 2021-11-01 09:26
 **/
public class Workspace extends JFrame implements ActionListener {
    private NettyClient client = null;
    JPanel jp1, jp2, jp3;
    JButton jb1, jb2;
    JTextField jtf;
    JTextArea jta;

    public Workspace() {
        // 创建面板
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        // 创建按钮
        jb1 = new JButton("连接");
        jb2 = new JButton("发送");
        jb1.addActionListener(this);
        jb2.addActionListener(this);

        // 创建文本框
        jtf = new JTextField(10);
        jta = new JTextArea(10, 20);
        jtf.setText(PropertyUtils.read("host"));
        jtf.setToolTipText("请输入IP或者域名");

        // 设置布局管理
        this.setLayout(new GridLayout(3, 1));

        // 加入各个组件
        jp1.add(jtf);

        jp2.add(jta);

        jp3.add(jb1);
        jp3.add(jb2);

        // 加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        // 设置窗体
        this.setTitle("NettyNetAssist v1.0");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "连接") {
            final String host = jtf.getText().trim();
            if (host.length() < 3) {
                JOptionPane.showMessageDialog(null, "请输入域名或者IP！", "提示消息", JOptionPane.WARNING_MESSAGE);
                return;
            }
            jb1.setEnabled(false);
            PropertyUtils.write("host", host);
            if (null != client) {
                client.close();
            }
            client = new NettyClient(7397, host);
        } else if (e.getActionCommand() == "发送") {
            if (null == client) {
                JOptionPane.showMessageDialog(null, "请先连接", "提示消息", JOptionPane.WARNING_MESSAGE);
                return;
            }
            client.write(jta.getText());
        }
    }

    public static void main(String[] args) {
        new Workspace();
    }
}

