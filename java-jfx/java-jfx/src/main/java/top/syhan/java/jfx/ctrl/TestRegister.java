package top.syhan.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;

/**
 * @program: java-jfx
 * @description:
 * @author: SYH
 * @Create: 2021-10-02 17:46
 **/
public class TestRegister {

    public Button btn;
    public DatePicker datePicker;
    public Button btn1;

    public void onBtnClick(ActionEvent actionEvent) {
        String info="登陆成功";
        Alert alert = new Alert(Alert.AlertType.INFORMATION, info, new ButtonType("确定"));
        alert.setHeaderText(null);
        alert.setTitle("提示");
        alert.show();
    }

    public void offBtnClick(ActionEvent actionEvent) {
        datePicker.setVisible(!datePicker.isVisible());
    }
}
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        alert.setContentText("国庆快乐");