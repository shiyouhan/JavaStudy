module top.syhan.linechar {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.syhan.linechart to javafx.fxml;
    exports top.syhan.linechart;
}