package top.syhan.address.view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import top.syhan.address.MainApp;

/**
 * @program: address
 * @description:
 * @author: SYH
 * @Create: 2021-10-11 21:02
 **/
public class RootController {

    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    public void handleShowBirthdayStatics() {
        mainApp.showBirthdayStatistics();
    }
}
