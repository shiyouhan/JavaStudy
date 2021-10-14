package top.syhan.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


import java.awt.*;

/**
 * @program: java-jfx
 * @description: 水平盒子布局
 * @author: SYH
 * @Create: 2021-10-04 19:42
 **/
public class HboxExample extends Application {
    @Override
    public void start(Stage stage){
        TextField textField = new TextField();
        Button playButton = new Button("play");
        Button stopButton = new Button("stop");

        HBox hbox = new HBox();
        hbox.setSpacing(10);
        HBox.setMargin(textField, new Insets(20,20,20,20));
        HBox.setMargin(playButton, new Insets(20,20,20,20));
        HBox.setMargin(stopButton, new Insets(20,20,20,20));

        hbox.getChildren().addAll(textField,playButton,stopButton);

        Scene scene = new Scene(hbox,400,300);
        stage.setTitle("Hbox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
