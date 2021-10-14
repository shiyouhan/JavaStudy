package top.syhan.java.jfx.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @program: java-jfx
 * @description:
 * @author: SYH
 * @Create: 2021-10-06 20:52
 **/
public class ControlExample extends Application {
    @Override
    public void start(Stage stage){
        //Drawing a circle
        Circle circle = new Circle();
        circle.setCenterX(230.0f);
        circle.setCenterY(180.0f);
        circle.setRadius(90.0f);

        //Setting color and stroke to the circle
        circle.setFill(Color.DARKGOLDENROD);
        circle.setStrokeWidth(3);
        circle.setStroke(Color.DARKGOLDENROD);

        //Drawing a text
        Text text = new Text("This is a colored circle");
        text.setFont(Font.font("Edwardian Script ITC",50));
        text.setX(80);
        text.setY(50);
        text.setFill(Color.BEIGE);
        text.setStrokeWidth(2);
        text.setStroke(Color.DARKSLATEBLUE);

        //Creating a Group object
        Group root = new Group(circle, text);
        Parent root1;
        Scene scene = new Scene(root,500,400);
        stage.setTitle("Color Example");
        stage.setScene(scene);
        stage.show();
    }
}
