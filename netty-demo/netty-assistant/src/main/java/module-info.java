module top.syhan.nettyassistant {
    requires java.desktop;
    requires io.netty.all;

    opens top.syhan.netty.assistant to javafx.fxml;
    exports top.syhan.netty.assistant.view;
}