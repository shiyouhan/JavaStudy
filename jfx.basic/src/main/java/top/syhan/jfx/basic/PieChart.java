package top.syhan.jfx.basic;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @program: jfx-basic
 * @description: 饼图
 * @author: SYH
 * @Create: 2021-10-17 20:51
 **/
public class PieChart extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        javafx.scene.chart.PieChart pieChart = new
                javafx.scene.chart.PieChart();
        pieChart.setData(getChartData());
        pieChart.setTitle("饼图");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);
        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }
    private ObservableList<javafx.scene.chart.PieChart.Data> getChartData()
    {
        ObservableList<javafx.scene.chart.PieChart.Data> answer =
                FXCollections.observableArrayList();
        answer.addAll(new javafx.scene.chart.PieChart.Data("Java", 17),
                new javafx.scene.chart.PieChart.Data("JavaFx", 31),
                new javafx.scene.chart.PieChart.Data("Swing", 10),
                new javafx.scene.chart.PieChart.Data("IO", 20),
                new javafx.scene.chart.PieChart.Data("NIO", 21)
        );
        return answer;
    }
    public static void main(String[] args) {
        launch();
    }
}

