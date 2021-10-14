module top.syhan.java.jfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jfoenix;
    requires javafx.web;
    requires AnimateFX;
    requires java.desktop;

    opens top.syhan.java.jfx.ctrl to javafx.fxml;
    opens top.syhan.java.jfx to javafx.fxml;
    exports top.syhan.java.jfx;

    opens top.syhan.java.jfx.layout to javafx.fxml;
    exports top.syhan.java.jfx.layout;

    opens top.syhan.java.jfx.basic to javafx.fxml;
    exports top.syhan.java.jfx.basic;

    opens top.syhan.java.jfx.effect to javafx.fxml;
    exports top.syhan.java.jfx.effect;
}