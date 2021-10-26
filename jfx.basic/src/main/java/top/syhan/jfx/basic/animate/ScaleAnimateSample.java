package top.syhan.jfx.basic.animate;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @program: jfx-basic
 * @description: JavaFX缩放动画
 * @author: SYH
 * @Create: 2021-10-26 20:29
 **/
public class ScaleAnimateSample extends Application {
    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);

        Rectangle rect = new Rectangle(150, 150, 150, 150);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.BLUE);

        ScaleTransition st = new ScaleTransition(Duration.millis(2000), rect);
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setAutoReverse(true);

        st.play();
        root.getChildren().add(rect);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
