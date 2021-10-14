package top.syhan.java.jfx.layout;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @program: java-jfx
 * @description:
 * @author: SYH
 * @Create: 2021-10-04 20:11
 **/
public class BorderPaneExample extends Application {
    @Override
    public void start(Stage stage){
        BorderPane bPane = new BorderPane();
        bPane.setTop(new TextField("Top"));
        bPane.setBottom(new TextField("Bottom"));
        bPane.setLeft(new TextField("Left"));
        bPane.setRight(new TextField("Right"));
        bPane.setCenter(new TextField("Center"));

        Scene scene = new Scene(bPane,400,300);
        stage.setTitle("BorderPane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
