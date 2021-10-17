module top.syhan.jfxbasic {
    requires javafx.controls;
    requires javafx.fxml;

    opens top.syhan.jfx.basic to javafx.fxml;
    exports top.syhan.jfx.basic;

    requires com.github.oshi;
    requires fastjson;
}