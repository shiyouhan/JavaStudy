package top.syhan.java.jfx.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.image.Image;

/**
 * @program: java-jfx
 * @description: 颜色调整效果
 * @author: SYH
 * @Create: 2021-10-07 19:08
 **/
public class ColorAdjustEffectExample extends Application {
    @Override
    public void start(Stage stage) {
        //自己找张图片
        Image image = new Image("https://cdn.jsdelivr.net/gh/shiyouhan/image/HMBB.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(70);
        imageView.setY(50);
        imageView.setFitWidth(400);
        imageView.setFitHeight(200);

        //Setting the preserve ratio of the image view
        imageView.setPreserveRatio(true);
        //Instantiating the ColorAdjust class
        ColorAdjust colorAdjust = new ColorAdjust();
        //Setting the contrast value 对比度
        colorAdjust.setContrast(-0.05);
        //Setting the hue value 色差
        colorAdjust.setHue(0.2);
        //Setting the brightness value 亮度
        colorAdjust.setBrightness(0.1);
        //Setting the saturation value 饱和度
        colorAdjust.setSaturation(0.2);
        //Applying color adjust effect to the ImageView node
        imageView.setEffect(colorAdjust);

        //Creating a Group object
        Group root = new Group(imageView);

        //Creating a scene object
        Scene scene = new Scene(root,450,300);
        stage.setTitle("Color Adjust effect example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
