module com.example.dday {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dday3 to javafx.fxml;
    exports com.example.dday3;
}