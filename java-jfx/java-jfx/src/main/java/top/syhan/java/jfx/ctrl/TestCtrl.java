package top.syhan.java.jfx.ctrl;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

/**
 * @program: java-jfx
 * @description: TestCtrl
 * @author: SYH
 * @Create: 2021-10-02 13:54
 **/
public class TestCtrl {

    public JFXButton btn;
    public DatePicker datePicker;

    public void onBtnClick(ActionEvent actionEvent) {
        datePicker.setVisible(!datePicker.isVisible());
    }
}
