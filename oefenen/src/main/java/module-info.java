module com.example.oefenen {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oefenen to javafx.fxml;
    exports com.example.oefenen;
}