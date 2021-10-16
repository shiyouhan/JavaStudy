module top.syhan.linechar {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.syhan.linechar to javafx.fxml;
    exports top.syhan.linechar;
}