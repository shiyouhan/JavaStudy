package top.syhan.java.jfx.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @program: java-jfx
 * @description: 网格布局
 * @author: SYH
 * @Create: 2021-10-05 19:30
 **/
public class GridPaneExample extends Application {

    @Override
    public void start(Stage stage) {
        Text text1 = new Text("Emial");
        Text text2 = new Text("Password");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        Button button1 = new Button("Sumbit");
        Button button2 = new Button("Clear");

        GridPane gridPane = new GridPane();
        gridPane.setMaxSize(300,200);
        gridPane.setPadding(new Insets(10, 10, 10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(text1,0,0);
        gridPane.add(textField1,1,0);
        gridPane.add(text2,0,1);
        gridPane.add(textField2,1,1);
        gridPane.add(button1,0,2);
        gridPane.add(button2,1,2);

        Scene scene = new Scene(gridPane,400,300);
        stage.setTitle("Gri Pane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
