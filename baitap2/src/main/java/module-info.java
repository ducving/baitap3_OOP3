module com.example.baitap2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baitap2 to javafx.fxml;
    exports com.example.baitap2;
}