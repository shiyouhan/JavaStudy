module top.syhan.weather.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;

    opens top.syhan.weather to javafx.fxml;
    exports top.syhan.weather;

    opens top.syhan.weather.view to javafx.fxml;
    exports top.syhan.weather.view;
    exports top.syhan.weather.util;
}