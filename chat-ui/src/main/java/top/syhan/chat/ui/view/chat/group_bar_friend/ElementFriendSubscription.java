package top.syhan.chat.ui.view.chat.group_bar_friend;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;

/**
 * @program: chat-ui
 * @description:
 * @author: SYH
 * @Create: 2021-10-27 22:28
 **/
public class ElementFriendSubscription {

    private final Pane pane;

    private Label head;
    private Label name;

    /**
     * 公众号面板
     */
    private final Pane subPane;

    public ElementFriendSubscription() {
        pane = new Pane();
        pane.setPrefSize(270, 70);
        pane.getStyleClass().add("elementFriendSubscription");
        ObservableList<Node> children = pane.getChildren();

        // 头像区域
        head = new Label();
        head.setPrefSize(50, 50);
        head.setLayoutX(15);
        head.setLayoutY(10);
        head.getStyleClass().add("elementFriendSubscription_head");
        children.add(head);

        // 名称区域
        name = new Label();
        name.setPrefSize(200, 40);
        name.setLayoutX(80);
        name.setLayoutY(15);
        name.setText("公众号");
        name.getStyleClass().add("elementFriendSubscription_name");
        children.add(name);

        // 初始化未装载
        subPane = new Pane();
        subPane.setPrefSize(850, 560);
        subPane.setStyle("-fx-background-color:transparent;");
        ObservableList<Node> subPaneChildren = subPane.getChildren();

        Button gzhButton = new Button();
        gzhButton.setPrefSize(65, 65);
        gzhButton.setLayoutX(90);
        gzhButton.setLayoutY(30);
        gzhButton.setStyle("-fx-background-color: transparent;" +
                "-fx-background-radius: 0px;" +
                "-fx-border-width: 50px;" +
                "-fx-background-size: cover;" +
                "-fx-background-image: url('https://bkimg.cdn.bcebos.com/pic/91ef76c6a7efce1b9d1612d92a18e4deb48f8c54cfc4?x-bce-process=image/watermark,image_d2F0ZXIvYmFpa2U5Mg==,g_7,xp_5,yp_5/format,f_auto');");
        subPaneChildren.add(gzhButton);

        Label gzhLabel = new Label();
        gzhLabel.setPrefSize(150, 20);
        gzhLabel.setLayoutX(95);
        gzhLabel.setLayoutY(100);
        gzhLabel.setText("--NIIT--");
        gzhLabel.setStyle("-fx-background-color: transparent;-fx-border-width: 0; -fx-text-fill: #999999;" +
                "-fx-font-size: 16px;");
        gzhLabel.setTextAlignment(TextAlignment.CENTER);
        subPaneChildren.add(gzhLabel);

    }

    public Pane pane() {
        return pane;
    }

    public Pane subPane() {
        return subPane;
    }

}
