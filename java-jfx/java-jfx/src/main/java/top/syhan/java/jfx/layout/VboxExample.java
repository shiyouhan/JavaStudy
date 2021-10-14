package top.syhan.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

/**
 * @program: java-jfx
 * @description:
 * @author: SYH
 * @Create: 2021-10-04 20:07
 **/
public class VboxExample extends Application {
    @Override
    public void start(Stage stage){
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        VBox.setMargin(textField, new Insets(20,20,20,20));
        VBox.setMargin(playButton, new Insets(20,20,20,20));
        VBox.setMargin(stopButton, new Insets(20,20,20,20));

        vBox.getChildren().addAll(textField,playButton,stopButton);

        Scene scene = new Scene(vBox,400,300);
        stage.setTitle("Vbox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
