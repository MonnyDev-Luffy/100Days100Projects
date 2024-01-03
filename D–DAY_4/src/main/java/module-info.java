module com.example.dday {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.datatransfer;
    requires java.desktop;


    opens com.example.dday4 to javafx.fxml;
    exports com.example.dday4;
}