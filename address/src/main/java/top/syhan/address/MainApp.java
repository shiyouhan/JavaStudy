package top.syhan.address;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import top.syhan.address.config.AppConfig;
import top.syhan.address.model.Person;
import top.syhan.address.view.BirthdayStatisticsController;
import top.syhan.address.view.PersonController;
import top.syhan.address.view.PersonEditController;
import top.syhan.address.view.RootController;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author apple
 */
public class MainApp extends Application {

    private final ObservableList<Person> personData = FXCollections.observableArrayList();

    private Stage primaryStage;

    private BorderPane rootLayout;


    public MainApp() {
        personData.add(new Person("王林", "软件2126", "男", "江苏南京",
                LocalDate.of(2000, 10, 24), new Image("https://i04piccdn.sogoucdn.com/cf84fd592a3493ba")));
        personData.add(new Person("彭海洋", "软件2126", "男", "江苏扬州",
                LocalDate.of(1999, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img11.jpg")));
        personData.add(new Person("郭佳", "软件2126", "女", "江苏苏州",
                LocalDate.of(2001, 11, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img12.jpg")));
        personData.add(new Person("黄志伟", "软件2126", "男", "江苏泰州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img13.jpg")));
        personData.add(new Person("张珂", "软件2126", "女", "江苏徐州",
                LocalDate.of(2001, 9, 11), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img14.jpg")));
        personData.add(new Person("赵丹", "软件2136", "女", "江苏南通",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img15.jpg")));
        personData.add(new Person("张建凤", "软件2136", "女", "江苏无锡",
                LocalDate.of(2001, 2, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img16.jpg")));
        personData.add(new Person("杨阳", "软件1851", "男", "江苏南京",
                LocalDate.of(2000, 10, 23), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img17.jpg")));
        personData.add(new Person("尚宇驰", "软件1851", "女", "江苏徐州",
                LocalDate.of(2000, 10, 24), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img20.jpg")));
        personData.add(new Person("陈蓉琪", "软件1851", "女", "江苏南京",
                LocalDate.of(2000, 3, 21), new Image("https://niit-soft.oss-cn-hangzhou.aliyuncs.com/purple/img19.jpg")));
    }


    public Stage getStage() {
        return this.primaryStage;
    }

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        stage.setTitle("AddressBook");
        initRootLayout();
        showPerson();

    }

    public void initRootLayout() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/root-layout.fxml"));
            rootLayout = fxmlLoader.load();
            RootController controller = fxmlLoader.getController();
            controller.setMainApp(this);
            //创建以根布局为内容的场景
            Scene scene = new Scene(rootLayout, AppConfig.stageWidth,AppConfig.stageHeight);
            //加载全局样式
            scene.getStylesheets().add(Objects.requireNonNull(MainApp.class.getResource("css/style.css")).toExternalForm());
            //主窗体加入根布局
            primaryStage.setScene(scene);
            primaryStage.setResizable(AppConfig.stageResizable);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPerson() {
        try {
            //加载人员显示面板
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person.fxml"));
            AnchorPane personPane = fxmlLoader.load();
            //根布局中间部分加入人员显示面板
            rootLayout.setCenter(personPane);
            //获得PersonController控制器
            PersonController controller = fxmlLoader.getController();
            //向控制器传参
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void showEditPerson(Person person, String type) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(MainApp.class.getResource("view/person-edit.fxml"));
            AnchorPane editPersonPane = fxmlLoader.load();
            //根布局中间部分加入人员编辑面板
            rootLayout.setCenter(editPersonPane);
            //获得PersonController控制器
            PersonEditController controller = fxmlLoader.getController();
            //向控制器传参
            controller.setArgs(person, type);
            controller.setMainApp(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showBirthdayStatistics() {
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/birthday-statistics.fxml"));
            AnchorPane page = loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Birthday Statistics");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            BirthdayStatisticsController controller = loader.getController();
            controller.setPersonData(personData);
            dialogStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ObservableList<Person> getPersonData() {
        return personData;
    }

    public static void main(String[] args) {
        launch();
    }

}