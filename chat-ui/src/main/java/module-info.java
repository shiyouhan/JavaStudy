module top.syhan.chat.ui {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.syhan.chat.ui to javafx.fxml;
    exports top.syhan.chat.ui;

//    opens top.syhan.chat.ui.view to javafx.fxml;
//    exports top.syhan.chat.ui.view;

    opens top.syhan.chat.ui.view.login to javafx.fxml;
    exports top.syhan.chat.ui.view.login;

    opens top.syhan.chat.ui.view.chat to javafx.fxml;
    exports top.syhan.chat.ui.view.chat;
}