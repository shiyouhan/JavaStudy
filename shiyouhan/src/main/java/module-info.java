module com.example.shiyouhan {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shiyouhan to javafx.fxml;
    exports com.example.shiyouhan;
}