module top.syhan.notepad {
    requires javafx.controls;
    requires javafx.fxml;


    opens top.syhan.notepad to javafx.fxml;
    exports top.syhan.notepad;

    exports top.syhan.notepad.view;
    opens top.syhan.notepad.view to javafx.fxml;
}