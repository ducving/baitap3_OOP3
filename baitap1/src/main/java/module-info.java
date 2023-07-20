module com.example.baitap1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baitap1 to javafx.fxml;
    exports com.example.baitap1;
}