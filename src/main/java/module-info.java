module com.example.demo1324 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo1324 to javafx.fxml;
    exports com.example.demo1324;
}