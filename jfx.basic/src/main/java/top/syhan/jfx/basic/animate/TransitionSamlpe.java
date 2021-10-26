package top.syhan.jfx.basic.animate;

import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @program: jfx-basic
 * @description: 打字动画
 * @author: SYH
 * @Create: 2021-10-26 20:21
 **/
public class TransitionSamlpe extends Application {
    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("TransitionSample");
        stage.setWidth(500);
        stage.setHeight(400);

        VBox vbox = new VBox();
        vbox.setLayoutX(20);
        vbox.setLayoutY(20);


        final String content = "As long as the mind does not slide, the method is more than difficult";
        final Text text = new Text(10, 20, "");

        final Animation animation = new Transition() {
            {
                setCycleDuration(Duration.millis(2000));
            }

            @Override
            protected void interpolate(double frac) {
                final int length = content.length();
                final int n = Math.round(length * (float) frac);
                text.setText(content.substring(0, n));
            }

        };
        animation.play();

        vbox.getChildren().add(text);
        vbox.setSpacing(10);
        ((Group) scene.getRoot()).getChildren().add(vbox);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
