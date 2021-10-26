module top.syhan.jfxbasic {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens top.syhan.jfx.basic to javafx.fxml;
    exports top.syhan.jfx.basic;

    requires com.github.oshi;
    requires fastjson;

    opens top.syhan.jfx.basic.trayicon to javafx.fxml;
    exports top.syhan.jfx.basic.trayicon;

    opens top.syhan.jfx.basic.animate to javafx.fxml;
    exports top.syhan.jfx.basic.animate;
}