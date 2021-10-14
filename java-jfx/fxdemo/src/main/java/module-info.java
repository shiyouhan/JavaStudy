module top.syhan.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens top.syhan.fxdemo to javafx.fxml;
    exports top.syhan.fxdemo;
}