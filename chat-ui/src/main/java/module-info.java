module top.syhan.chatui {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.syhan.chat.ui to javafx.fxml;
    exports top.syhan.chat.ui;
}