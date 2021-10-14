package top.syhan.java.jfx.layout;

import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @program: java-jfx
 * @description: 锚点布局
 * @author: SYH
 * @Create: 2021-10-05 19:09
 **/
public class AnchorPaneExample extends Application {
    @Override
    public void start(Stage stage){
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(180.0f);
        cylinder.setRadius(100.0f);

        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.BLANCHEDALMOND);

        cylinder.setMaterial(material);

        RotateTransition rotateTransition = new RotateTransition();
        rotateTransition.setDuration(Duration.millis(1000));
        rotateTransition.setNode(cylinder);
        rotateTransition.setAxis(Rotate.X_AXIS);
        rotateTransition.setByAngle(360);
        rotateTransition.setCycleCount(RotateTransition.INDEFINITE);
        rotateTransition.setAutoReverse(false);
        rotateTransition.play();

        AnchorPane anchorPane = new AnchorPane();
        AnchorPane.setTopAnchor(cylinder, 100.0);
        AnchorPane.setLeftAnchor(cylinder, 150.0);
        AnchorPane.setRightAnchor(cylinder, 50.0);
        AnchorPane.setBottomAnchor(cylinder, 50.0);

        anchorPane.getChildren().addAll(cylinder);

        Parent root;
        Scene scene = new Scene(anchorPane, 550,400);
        stage.setTitle("Anchor Pane Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
