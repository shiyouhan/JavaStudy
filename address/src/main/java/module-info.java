module top.syhan.address {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.syhan.address to javafx.fxml;
    exports top.syhan.address.view;
    opens top.syhan.address.view to javafx.fxml;
    exports top.syhan.address;
}