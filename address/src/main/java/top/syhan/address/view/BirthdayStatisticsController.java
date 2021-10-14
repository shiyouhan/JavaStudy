package top.syhan.address.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import top.syhan.address.model.Person;

import java.text.DateFormatSymbols;
import java.util.List;
import java.util.Locale;

/**
 * @program: address
 * @description:
 * @author: SYH
 * @Create: 2021-10-11 21:18
 **/
public class BirthdayStatisticsController {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis xAxis;

    private final ObservableList<String> monthNames = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        String[] months = DateFormatSymbols.getInstance(Locale.CHINA).getMonths();
        xAxis.setCategories(monthNames);
    }

    public void setPersonData(List<Person> persons) {
        int[] monthCounter = new int[12];
        for (Person p : persons) {
            int month = p.getBirthday().getMonthValue() - 1;
            monthCounter[month]++;
        }
        XYChart.Series<String, Integer> series = new XYChart.Series<>();
        for (int i = 0,len = monthCounter.length; i< len; i++) {
            series.getData().add(new XYChart.Data<>(monthNames.get(i),monthCounter[i]));
        }
        barChart.getData().add(series);
    }
}
