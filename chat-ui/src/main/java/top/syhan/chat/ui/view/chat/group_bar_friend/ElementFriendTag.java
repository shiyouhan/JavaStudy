package top.syhan.chat.ui.view.chat.group_bar_friend;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

/**
 * @program: chat-ui
 * @description: 占位标签:新的朋友、公众号、群组、好友
 * @author: SYH
 * @Create: 2021-10-27 22:29
 **/
public class ElementFriendTag {

    private final Pane pane;

    public ElementFriendTag(String tagText) {
        pane = new Pane();
        pane.setPrefSize(270, 24);
        pane.setStyle("-fx-background-color: transparent;");
        ObservableList<Node> children = pane.getChildren();

        Button label = new Button();
        label.setPrefSize(260, 24);
        label.setLayoutX(5);
        label.setText(tagText);
        label.getStyleClass().add("element_friend_tag");
        children.add(label);

    }

    public Pane pane() {
        return pane;
    }

}
