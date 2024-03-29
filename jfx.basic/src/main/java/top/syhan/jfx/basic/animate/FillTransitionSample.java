package top.syhan.jfx.basic.animate;

import javafx.animation.FillTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @program: jfx-basic
 * @description: 过渡动画举例
 * @author: SYH
 * @Create: 2021-10-26 20:26
 **/
public class FillTransitionSample extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("");
        Group root = new Group();
        Scene scene = new Scene(root, 500, 400, Color.WHITE);
        Group g = new Group();

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setColor(Color.color(0.4, 0.4, 0.4));

        Ellipse ellipse = new Ellipse();
        ellipse.setCenterX(150.0f);
        ellipse.setCenterY(150.0f);
        ellipse.setRadiusX(150.0f);
        ellipse.setRadiusY(150.0f);
        ellipse.setEffect(ds);

        FillTransition ft = new FillTransition(Duration.millis(3000), ellipse, Color.BLUE, Color.RED);
        ft.setAutoReverse(true);
        ft.play();

        g.getChildren().add(ellipse);

        root.getChildren().add(g);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
